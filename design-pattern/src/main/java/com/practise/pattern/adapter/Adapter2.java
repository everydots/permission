package com.practise.pattern.adapter;

public class Adapter2 extends Adaptee implements Target2 {

    @Override
    public String request() {
        return targetRequest();
    }
}
