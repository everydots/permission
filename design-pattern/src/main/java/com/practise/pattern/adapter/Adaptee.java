package com.practise.pattern.adapter;

import com.practise.core.Constants;

public class Adaptee {

    public String targetRequest() {
        return Constants.ADAPTER_NEW_TEXT;
    }
}
