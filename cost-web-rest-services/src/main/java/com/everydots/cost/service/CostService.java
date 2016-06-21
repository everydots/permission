package com.everydots.cost.service;

import com.everydots.cost.beans.CostRecord;

import java.util.List;

public interface CostService {

    String insertMockRecords();

    String insertCost(CostRecord costRecord);

    List<CostRecord> retrieveCosts();

    String updateCost(CostRecord costRecord);

    String insertCosts(List<CostRecord> costRecords);
}
