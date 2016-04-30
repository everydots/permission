package com.practise.overwrite;

public abstract class Parent<T> {

    private T field;

    public abstract T getField();

    public abstract void setField(T field);
}
