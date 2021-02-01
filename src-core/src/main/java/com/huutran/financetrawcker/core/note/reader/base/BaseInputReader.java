package com.huutran.financetrawcker.core.note.reader.base;

import com.huutran.financetrawcker.core.note.datamodel.BaseData;

import java.util.List;

public abstract class BaseInputReader implements InputReader {


    protected InputReader reader;


    protected BaseInputReader(InputReader exportable) {
        this.reader = exportable;
    }

    @Override
    public List<? extends BaseData> convertData() {
        return reader.convertData();
    }
}
