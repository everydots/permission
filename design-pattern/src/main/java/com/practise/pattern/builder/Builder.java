package com.practise.pattern.builder;

public interface Builder {

    public Builder buildPartA();

    public Builder buildPartB();

    public Builder buildPartC();

    Product getResult();
}
