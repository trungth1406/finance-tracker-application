package com.huutran.financetrawcker.core.persistence;


import com.huutran.financetrawcker.core.note.NoteData;

import java.nio.file.Path;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NoteReader {
    private static final String QUERY = """
            SELECT n.Z_PK,
                   n.ZNOTE                                      as note_id,
                   n.ZDATA                                      as data,
                   c1.ZTITLE1                                   as title,
                   c1.ZIDENTIFIER                               as noteID,
                   c2.ZTITLE2                                   as folderName,
                   c2.ZIDENTIFIER                               as folderID
            FROM ZICNOTEDATA as n
                     LEFT JOIN ZICCLOUDSYNCINGOBJECT as c1 ON c1.ZNOTEDATA = n.Z_PK
                     LEFT JOIN ZICCLOUDSYNCINGOBJECT as c2 ON c2.Z_PK = c1.ZFOLDER
                     LEFT JOIN ZICCLOUDSYNCINGOBJECT as c3 ON c3.ZNOTE = n.ZNOTE
            WHERE folderName ='CHI TIÊU'
            ORDER BY note_id""";

    public static List<NoteData> exportToTextFile(Path filePath) throws SQLException {
        try (Connection connection = getConnection(filePath.toString())) {
            Statement statement = connection.createStatement();
            List<NoteData> entriesFrom = getEntriesFrom(statement);
            return entriesFrom;
        }
    }

    private static List<NoteData> getEntriesFrom(Statement statement) {
        List<NoteData> entries = new ArrayList<>();
        try (ResultSet resultSet = statement.executeQuery(QUERY)) {
            while (resultSet.next()) {
                entries.add(
                        new NoteData(
                                resultSet.getInt("note_id"),
                                resultSet.getBytes("data"),
                                resultSet.getString("title")));
            }
            return entries;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return Collections.emptyList();
        }
    }

    private static Connection getConnection(String path) throws SQLException {
        return DriverManager.getConnection(path);
    }


}
