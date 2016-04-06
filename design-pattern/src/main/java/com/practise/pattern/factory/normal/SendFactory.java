package com.practise.pattern.factory.normal;

import com.practise.pattern.enums.ClassType;

public class SendFactory {

    public Sender getInstance(String type) {
        if (type.equals(ClassType.EMAIL.toString())) {
            return new MailSender();
        } else {
            return new SmsSender();
        }
    }

    public static Sender getMailInstance() {
        return new MailSender();
    }

    public static Sender getSmsSender() {
        return new SmsSender();
    }
}
