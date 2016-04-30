package com.practise.pattern.state;

import com.practise.core.Constants;

public class ConcrateStateA implements State {

    private static State instance = new ConcrateStateA();

    public static State getInstance() {
        return instance;
    }

    @Override
    public void handle(Context context) {
        System.out.println(Constants.STATE_TEXT_A);
        context.changeState(ConcrateStateB.getInstance());
    }
}
