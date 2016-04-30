package com.practise.pattern.state;

import com.practise.core.Constants;

public class ConcrateStateB implements State {

    private static State instance = new ConcrateStateB();

    public static State getInstance() {
        return instance;
    }

    @Override
    public void handle(Context context) {
        System.out.println(Constants.STATE_TEXT_B);
        context.changeState(ConcrateStateA.getInstance());
    }
}
