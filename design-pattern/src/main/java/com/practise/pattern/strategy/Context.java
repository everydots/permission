package com.practise.pattern.strategy;

public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String algorithm() {
        return strategy.algorithm();
    }
}
