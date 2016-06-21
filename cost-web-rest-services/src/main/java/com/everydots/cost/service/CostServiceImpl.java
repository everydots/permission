package com.everydots.cost.service;

import com.everydots.cost.beans.CostItem;
import org.apache.commons.lang.math.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class CostServiceImpl implements CostService {

    private String[] service_names = {"EC2", "S3", "RDS", "Kinesis"};

    @Override
    public String insertMockRecords() {
        return insertCosts(mockCostRecords(100));
    }

    @Override
    public String insertCost(CostItem costItem) {
        return null;
    }

    @Override
    public List<CostItem> retrieveCosts() {
        return null;
    }

    @Override
    public String updateCost(CostItem costItem) {
        return null;
    }

    @Override
    public String insertCosts(List<CostItem> costItems) {
        return null;
    }

    private List<CostItem> mockCostRecords(int length) {
        ArrayList<CostItem> costItems = new ArrayList<CostItem>();
        for (int index = 0; index < length; index++) {
            CostItem costItem = new CostItem();
            costItem.setCost(RandomUtils.nextDouble());
            costItem.setService_name(service_names[RandomUtils.nextInt(service_names.length)]);
            costItems.add(costItem);
        }
        return costItems;
    }
}
