package com.huutran.financetrawcker.core.note;

import java.util.List;

public class NoteContent {

    private List<String> lines;
    private String title;

    public NoteContent(List<String> lines, String title) {
        this.lines = lines;
        this.title = title;
    }
}
