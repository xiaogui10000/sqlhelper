package com.jn.sqlhelper.common.ddl.model.internal;

import com.jn.langx.Converter;

public class TableTypeConverter implements Converter<String, TableType> {
    @Override
    public TableType apply(String input) {
        return TableType.ofCode(input);
    }
}
