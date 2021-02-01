package com.huutran.financetrawcker.core.note.datamodel;

public class RawNoteData extends BaseData {

    private byte[] noteData;

    public RawNoteData(Integer id, String title, byte[] noteData) {
        super(id, title);
        this.noteData = noteData;
    }

    public byte[] getNoteData() {
        return noteData;
    }

    public void setNoteData(byte[] noteData) {
        this.noteData = noteData;
    }

}
