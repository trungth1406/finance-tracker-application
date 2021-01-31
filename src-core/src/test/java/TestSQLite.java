import com.huutran.financetrawcker.core.note.DecompressedNote;
import com.huutran.financetrawcker.core.note.NoteData;
import com.huutran.financetrawcker.core.persistence.NoteReader;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.sql.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestSQLite {

    static final String FILE_PATH = "jdbc:sqlite:" +
            "/Users/trungtran/Library/Group Containers/group.com.apple.notes/NoteStore.sqlite";

    @SneakyThrows
    @BeforeEach
    void setUp() {
        Class.forName("org.sqlite.JDBC");
    }

    @Test
    public void testConnection() throws SQLException, ClassNotFoundException {
        List<NoteData> noteData = NoteReader.exportToTextFile(Path.of(FILE_PATH));
        for (NoteData data : noteData) {
            DecompressedNote plainText = new DecompressedNote(data);
            plainText.getNoteContent().forEach(System.out::println);
            assertNotEquals(plainText.getNoteContent().size(), 0);
        }
    }
}
