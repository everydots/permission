package com.practise.pattern.enums;

public enum ClassType {

    SMS("sms"), EMAIL("email");

    private final String value;


    ClassType(String email) {
        this.value = email;
    }
}
