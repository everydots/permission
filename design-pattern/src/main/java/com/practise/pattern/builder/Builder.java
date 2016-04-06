package com.practise.pattern.builder;

public interface Builder {

    public void buildPartA();

    public void buildPartB();

    public void buildPartC();

     Product getResult();
}
