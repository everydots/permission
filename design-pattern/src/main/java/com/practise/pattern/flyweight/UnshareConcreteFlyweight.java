package com.practise.pattern.flyweight;

import com.practise.core.Constants;

public class UnshareConcreteFlyweight implements Flyweight {

    private int allState;

    @Override
    public String operation() {
        return Constants.FLYWEIGHT_UNSHARE_TEXT;
    }

    public int getAllState() {
        return allState;
    }

    public void setAllState(int allState) {
        this.allState = allState;
    }
}
