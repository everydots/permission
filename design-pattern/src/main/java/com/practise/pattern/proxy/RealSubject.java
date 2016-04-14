package com.practise.pattern.proxy;

import com.practise.core.Constants;

public class RealSubject implements Subject {
    @Override
    public String request() {
        return Constants.PROXY_TEXT;
    }
}
