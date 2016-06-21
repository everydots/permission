package com.everydots.cost.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.everydots.cost.beans.CostRecord;
import com.everydots.cost.common.Constants;
import com.everydots.cost.common.SQLs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CostDaoImpl implements CostDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public String insertRecords(final List<CostRecord> records) {
        jdbcTemplate.batchUpdate(SQLs.INSERT_COST_SQL, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int index) throws SQLException {
                ps.setString(index, records.get(index).getId());
                ps.setString(index, records.get(index).getService_name());
                ps.setDouble(index, records.get(index).getCost());
            }

            @Override
            public int getBatchSize() {
                return records.size();
            }
        });
        return Constants.SUCCESS;
    }

    @Override
    public String insertRecord(CostRecord record) {
        return null;
    }

    @Override
    public CostRecord updateRecord(CostRecord record) {
        return null;
    }

    @Override
    public List<CostRecord> retrieveRecords(CostRecord record) {
        return null;
    }
}
