package com.practise.overwrite;

public class ChildB extends Parent<ChildFieldB> {

    private ChildFieldB field;

    private String self;

    @Override
    public ChildFieldB getField() {
        return field;
    }

    @Override
    public void setField(ChildFieldB field) {
        this.field = field;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }
}
