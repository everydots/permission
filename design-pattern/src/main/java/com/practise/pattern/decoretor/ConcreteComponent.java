package com.practise.pattern.decoretor;

import com.practise.core.Constants;

public class ConcreteComponent implements Component {
    @Override
    public String operate() {
        return Constants.DECORATOR_TEXT;
    }
}
