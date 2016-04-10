package com.practise.pattern.decoretor;

public abstract class Decorator {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }


    public String operate() {
        return component.operate();
    }
}
