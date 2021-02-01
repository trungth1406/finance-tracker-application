package com.huutran.financetrawcker.core.note.reader;

import com.huutran.financetrawcker.core.note.datamodel.BaseData;
import com.huutran.financetrawcker.core.note.datamodel.RawNoteData;
import com.huutran.financetrawcker.core.note.datamodel.TextNoteData;
import com.huutran.financetrawcker.core.note.reader.base.BaseInputReader;
import com.huutran.financetrawcker.core.note.reader.base.InputReader;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class DecompressedDecorator extends BaseInputReader {


    public DecompressedDecorator(InputReader exportable) {
        super(exportable);
    }

    @Override
    public List<? extends BaseData> convertData() {
        List<? extends BaseData> converted = super.convertData();
        List<TextNoteData> textNoteData = new ArrayList<>();
        converted.forEach(data -> {
            byte[] noteData = ((RawNoteData) data).getNoteData();
            String decompressedData = this.toPlainText(this.decompress(noteData));
            TextNoteData textFormat = new TextNoteData(data.getId(), data.getTitle(),
                    Arrays.asList(decompressedData.split("\n")));
            textNoteData.add(textFormat);
        });
        return textNoteData;
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
