package com.practise.pattern.proxy;

import com.practise.core.Constants;

public class Proxy implements Subject {

    private RealSubject subject;

    public Proxy(RealSubject subject) {
        this.subject = subject;
    }

    public String preRequest() {
        return Constants.PROXY_PRE_REQUEST;
    }

    public String postRequest() {
        return Constants.PROXY_POST_REQUEST;
    }

    @Override
    public String request() {
        return preRequest() + subject.request() + postRequest();
    }
}
