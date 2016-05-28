package com.practise.pattern.mediator;

public abstract class Mediator {

    public abstract void operate(int number);

    public abstract void register(int number, Colleague colleague);
}
