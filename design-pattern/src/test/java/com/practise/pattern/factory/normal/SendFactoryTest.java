package com.practise.pattern.factory.normal;

import com.practise.pattern.enums.ClassType;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SendFactoryTest {

    @Test
    public void shouldReturnSmsSenderWhenPassSms() throws Exception {

        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.getInstance(ClassType.EMAIL.toString());
        String result = sender.send();

        assertThat(result, is("mail send!"));
    }

    @Test
    public void shouldReturnSmsSenderWhenGetSmsSender() throws Exception {

        Sender sender = SendFactory.getSmsSender();
        String result = sender.send();

        assertThat(result, is("sms send!"));
    }


}