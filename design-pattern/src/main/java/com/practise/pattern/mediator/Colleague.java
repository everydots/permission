package com.practise.pattern.mediator;

public abstract class Colleague {

    Mediator mediator;

    abstract void receiveMsg(int number);

    abstract void sendMsg(int number, Colleague colleague);

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
