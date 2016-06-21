package com.everydots.cost.dao;

import com.everydots.cost.beans.CostRecord;

import java.util.List;

public interface CostDao {

    String insertRecords(List<CostRecord> records);

    String insertRecord(CostRecord record);

    CostRecord updateRecord(CostRecord record);

    List<CostRecord> retrieveRecords(CostRecord record);
}
