package com.everydots.cost.service;

import com.everydots.cost.beans.CostItem;

import java.util.List;

public interface CostService {

    String insertMockRecords();

    String insertCost(CostItem costItem);

    List<CostItem> retrieveCosts();

    String updateCost(CostItem costItem);

    String insertCosts(List<CostItem> costItems);
}
