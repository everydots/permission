package com.practise.pattern.mediator;

import java.util.concurrent.ConcurrentHashMap;

public class ConcreteMediator extends Mediator {

    private ConcurrentHashMap colleagues = new ConcurrentHashMap();

    @Override
    public void operate(int number) {
        Colleague colleague = (Colleague) colleagues.get(number);
        if (colleague != null) {
            colleague.sendMsg(number, colleague);
        }
    }

    @Override
    public void register(int number, Colleague colleague) {
        colleagues.put(number, colleague);
        colleague.setMediator(this);
    }


}
