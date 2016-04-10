package com.practise.pattern.decoretor;

import com.practise.core.Constants;

public class ConcreteDecoratorB extends Decorator {


    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public String addBehavior() {
        return Constants.DECORATOR_ADD_BEHAVIOR2;
    }
}
