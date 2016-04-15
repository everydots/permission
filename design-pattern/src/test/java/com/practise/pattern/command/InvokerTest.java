package com.practise.pattern.command;

import com.practise.core.Constants;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


public class InvokerTest {
    @Test
    public void shouldReturnReceiverText() throws Exception {

        Receiver receiver = new Receiver();
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(concreteCommand);

        assertThat(invoker.call(), is(Constants.COMMAND_RECIVER_TEXT));

    }
}