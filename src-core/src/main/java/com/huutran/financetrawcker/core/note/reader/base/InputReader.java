package com.huutran.financetrawcker.core.note.reader.base;

import com.huutran.financetrawcker.core.note.datamodel.BaseData;

import java.util.List;

public interface InputReader {

    List<? extends BaseData> convertData();
}
