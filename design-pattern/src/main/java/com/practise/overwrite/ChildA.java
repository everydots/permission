package com.practise.overwrite;


public class ChildA extends Parent<ChildFieldA> {

    private ChildFieldA field;

    @Override
    public ChildFieldA getField() {
        return field;
    }

    public void setField(ChildFieldA field) {
        this.field = field;
    }
}
