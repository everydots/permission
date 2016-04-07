package com.practise.pattern.factory.normal;

public class MailSender implements Sender {
    @Override
    public String send() {
        return "mail send!";
    }
}
