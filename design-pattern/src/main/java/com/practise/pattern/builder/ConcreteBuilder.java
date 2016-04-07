package com.practise.pattern.builder;

public class ConcreteBuilder implements Builder {

    private StringBuffer stringBuffer = new StringBuffer();

    @Override
    public Builder buildPartA() {
        stringBuffer.append("partA");
        return this;
    }

    @Override
    public Builder buildPartB() {
        stringBuffer.append("partB");
        return this;
    }

    @Override
    public Builder buildPartC() {
        stringBuffer.append("partC");
        return this;
    }

    @Override
    public Product getResult() {
        return new Product(stringBuffer.toString());
    }

    public void setStringBuffer(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }
}
