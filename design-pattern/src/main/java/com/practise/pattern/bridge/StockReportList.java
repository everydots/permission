package com.practise.pattern.bridge;

import java.util.ArrayList;

public class StockReportList extends Report {


    ArrayList stock = new ArrayList();
    public StockReportList(Reporter reporter) {
        super(reporter);
    }


    public void addStockItem(StockItem item) {
        stock.add(item);
        addReportItem(item);
    }
}
