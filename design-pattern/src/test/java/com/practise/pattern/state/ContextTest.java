package com.practise.pattern.state;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mxxiao on 4/30/16.
 */
public class ContextTest {

    @Test
    public void shouldChangeState() throws Exception {

        Context context = new Context(new ConcrateStateA());

        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
    }
}