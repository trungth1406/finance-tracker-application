package com.huutran.financetrawcker.core.note.reader;


import com.huutran.financetrawcker.core.note.datamodel.BaseData;
import com.huutran.financetrawcker.core.note.datamodel.RawNoteData;
import com.huutran.financetrawcker.core.note.reader.base.InputReader;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NoteReader implements InputReader {

    private static final String FILE_PATH = "jdbc:sqlite:" +
            "/Users/trungtran/Library/Group Containers/group.com.apple.notes/NoteStore.sqlite";

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

    public NoteReader() {
    }


    @Override
    public List<? extends BaseData> convertData() {
        try {
            return this.getData();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return Collections.emptyList();
        }
    }

    public List<RawNoteData> getData() throws SQLException {
        try (Connection connection = getConnection(FILE_PATH)) {
            Statement statement = connection.createStatement();
            return getEntriesFrom(statement);
        }
    }

    private Connection getConnection(String path) throws SQLException {
        return DriverManager.getConnection(path);
    }

    private List<RawNoteData> getEntriesFrom(Statement statement) {
        List<RawNoteData> entries = new ArrayList<>();
        try (ResultSet resultSet = statement.executeQuery(QUERY)) {
            while (resultSet.next()) {
                entries.add(
                        new RawNoteData(
                                resultSet.getInt("note_id"),
                                resultSet.getString("title"),
                                resultSet.getBytes("data")));
            }
            return entries;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return Collections.emptyList();
        }
    }
}
