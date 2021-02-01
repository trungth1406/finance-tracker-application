package com.huutran.financetrawcker.core.note.datamodel;

import java.util.List;

public class TextNoteData extends BaseData {

    private List<String> lines;

    public TextNoteData(Integer id, String title, List<String> lines) {
        super(id, title);
        this.lines = lines;
    }

    public List<String> getLines() {
        return lines;
    }
}
