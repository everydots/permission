package com.practise.pattern.observer;

import com.practise.core.Constants;

public class ConcreteObserverA implements Observer {
    @Override
    public void update() {
        System.out.println(Constants.OBSERVER_UPDATE_TEXTA);
    }
}
