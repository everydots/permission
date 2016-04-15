package com.practise.pattern.command;

import com.practise.core.Constants;

public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute() {
        return receiver.action();
    }
}
