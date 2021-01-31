package com.huutran.financetrawcker.core.note;

public class NoteData {
    private Integer id;
    private byte[] noteData;
    private String title;

    public NoteData(Integer id, byte[] noteData, String title) {
        this.id = id;
        this.noteData = noteData;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getNoteData() {
        return noteData;
    }

    public void setNoteData(byte[] noteData) {
        this.noteData = noteData;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
