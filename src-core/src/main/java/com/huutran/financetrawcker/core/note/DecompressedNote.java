package com.huutran.financetrawcker.core.note;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.GZIPInputStream;

public class DecompressedNote {

    private final NoteData noteData;

    public DecompressedNote(NoteData noteData) {
        this.noteData = noteData;
    }

    public List<String> getNoteContent() {
        String decompressed = this.decompress(this.noteData.getNoteData());
        String plainText = this.toPlainText(decompressed);
        String[] line = plainText.split("\n");
        return Arrays.stream(line).filter(s -> !s.isBlank() && !s.isEmpty()).collect(Collectors.toList());
    }

    public String getNoteTitle() {
        return this.noteData.getTitle();
    }


    private String decompress(byte[] data) {
        try (GZIPInputStream is = new GZIPInputStream(new ByteArrayInputStream(data));
             StringWriter stringWriter = new StringWriter()) {
            IOUtils.copy(is, stringWriter, Charsets.UTF_8);
            return stringWriter.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private String toPlainText(String rawInput) {
        int start = rawInput.indexOf("\u0008\u0000\u0010\u0000\u001a");
        start = rawInput.indexOf("u0012", start + 1) + 2;
        int end = rawInput.indexOf("\u0004\u0008\u0000\u0010\u0000\u0010\u0000\u001a\u0004\u0008\u0000", start);
        return rawInput.substring(start, end);
    }

}
