package com.everydots.cost.service;

import com.everydots.cost.beans.CostRecord;

import java.util.List;
import java.util.Map;

public interface CostService {

    String insertMockRecords();

    String insertCost(CostRecord costRecord);

    List<Map<String, Object>> statisticRecords();

    String updateCost(CostRecord costRecord);

    String insertCosts(List<CostRecord> costRecords);
}
