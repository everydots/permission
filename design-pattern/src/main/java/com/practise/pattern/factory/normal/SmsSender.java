package com.practise.pattern.factory.normal;

public class SmsSender implements Sender {
    @Override
    public String send() {
        return "sms send!";
    }
}
