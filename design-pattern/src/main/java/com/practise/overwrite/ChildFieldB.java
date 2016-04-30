package com.practise.overwrite;

public class ChildFieldB extends ParentField {

    private String field;
    private String fieldB;

    @Override
    public String getField() {
        return field;
    }

    @Override
    public void setField(String field) {
        this.field = field;
    }

    public ChildFieldB(String fieldB) {
        this.fieldB = fieldB;
    }

    public String getFieldB() {
        return fieldB;
    }

    public void setFieldB(String fieldB) {
        this.fieldB = fieldB;
    }
}
