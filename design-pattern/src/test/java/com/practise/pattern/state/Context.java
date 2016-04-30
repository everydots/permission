package com.practise.pattern.state;

public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void request() {
        this.state.handle(this);
    }
}
