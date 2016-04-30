package com.practise.pattern.strategy;

import com.practise.core.Constants;

public class ConcreteStrategyB implements Strategy {
    @Override
    public String algorithm() {
        return Constants.STRATEGY_TEXT_B;
    }
}
