package com.practise.pattern.decoretor;

import com.practise.core.Constants;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConcreteComponentTest {

    @Test
    public void shouldReturnDecoratorText() throws Exception {

        Component component = new ConcreteComponent();

        assertThat(component.operate(), is(Constants.DECORATOR_TEXT));
    }


    @Test
    public void shouldInvokeDecoratorMethod() throws Exception {

        Component component = new ConcreteComponent();

        ConcreteDecoratorA decorator = new ConcreteDecoratorA(component);

        assertThat(decorator.operate(), is(Constants.DECORATOR_TEXT));
        assertThat(decorator.addBehavior(), is(Constants.DECORATOR_ADD_BEHAVIOR1));
    }
}