package com.practise.pattern.flyweight;

import com.practise.core.Constants;

public class ConcreteFlyweight implements Flyweight {

    private int initState;

    public int getInitState() {
        return initState;
    }

    public void setInitState(int initState) {
        this.initState = initState;
    }

    @Override
    public String operation() {
        return Constants.FLYWEIGHT_TEXT;
    }
}
