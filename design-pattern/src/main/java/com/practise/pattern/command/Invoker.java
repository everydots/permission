package com.practise.pattern.command;


//todo try to use message quene to finish this pattern
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public String call() {
        return command.execute();
    }
}
