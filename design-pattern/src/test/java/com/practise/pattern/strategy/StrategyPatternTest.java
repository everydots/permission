package com.practise.pattern.strategy;

import com.practise.core.Constants;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by mxxiao on 4/30/16.
 */
public class StrategyPatternTest {

    @Test
    public void shouldInvokeAlgorithmA() throws Exception {

        Strategy concreteStrategyA = new ConcreteStrategyA();
        Context context = new Context();

        context.setStrategy(concreteStrategyA);
        assertThat(context.algorithm(), is(Constants.STRATEGY_TEXT_A));
    }

    @Test
    public void shouldInvokeAlgorithmB() throws Exception {
        Strategy concreteStrategyB = new ConcreteStrategyB();

        Context context = new Context();
        context.setStrategy(concreteStrategyB);

        assertThat(context.algorithm(), is(Constants.STRATEGY_TEXT_B));
    }
}