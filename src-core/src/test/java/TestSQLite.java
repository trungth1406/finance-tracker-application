import com.huutran.financetrawcker.core.note.datamodel.BaseData;
import com.huutran.financetrawcker.core.note.reader.DecompressedDecorator;
import com.huutran.financetrawcker.core.note.reader.NoteReader;
import com.huutran.financetrawcker.core.note.datamodel.TextNoteData;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

 class TestSQLite {


    @SneakyThrows
    @BeforeEach
    void setUp() {
        Class.forName("org.sqlite.JDBC");
    }

    @Test
    void testConnection() throws SQLException, ClassNotFoundException {
        DecompressedDecorator plainText = new DecompressedDecorator(new NoteReader());
        List<? extends BaseData> convert = plainText.convertData();
        for (BaseData noteData : convert) {
            if (noteData instanceof TextNoteData) {
                System.out.println(((TextNoteData) noteData).getLines());
                assertNotEquals(0, ((TextNoteData) noteData).getLines().size());
            }
        }

    }
}
