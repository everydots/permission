package com.practise.pattern.adapter;

import com.practise.core.Constants;

public class RealTarget2 implements Target2 {
    @Override
    public String request() {
        return Constants.ADAPTER_TEXT;
    }
}
