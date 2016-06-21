package com.everydots.cost.service;

import com.everydots.cost.beans.CostRecord;
import com.everydots.cost.dao.CostDao;
import org.apache.commons.lang.math.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class CostServiceImpl implements CostService {

    private CostDao costDao;

    private String[] service_names = {"EC2", "S3", "RDS", "Kinesis"};

    @Override
    public String insertMockRecords() {
        return insertCosts(mockCostRecords(100));
    }

    @Override
    public String insertCost(CostRecord costRecord) {
        return null;
    }

    @Override
    public List<CostRecord> retrieveCosts() {
        return null;
    }

    @Override
    public String updateCost(CostRecord costRecord) {
        return null;
    }

    @Override
    public String insertCosts(List<CostRecord> costRecords) {


        return null;
    }

    private List<CostRecord> mockCostRecords(int length) {
        ArrayList<CostRecord> costRecords = new ArrayList<CostRecord>();
        for (int index = 0; index < length; index++) {
            CostRecord costRecord = new CostRecord();
            costRecord.setCost(RandomUtils.nextDouble());
            costRecord.setService_name(service_names[RandomUtils.nextInt(service_names.length)]);
            costRecords.add(costRecord);
        }
        return costRecords;
    }
}
