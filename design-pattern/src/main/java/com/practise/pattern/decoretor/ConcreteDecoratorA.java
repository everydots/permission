package com.practise.pattern.decoretor;

import com.practise.core.Constants;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public String addBehavior() {
        return Constants.DECORATOR_ADD_BEHAVIOR1;
    }
}
