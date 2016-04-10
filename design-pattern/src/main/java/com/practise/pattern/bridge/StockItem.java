package com.practise.pattern.bridge;

public class StockItem {

    private int index;

    @Override
    public String toString() {
        return "StockItem" + index++;
    }
}
