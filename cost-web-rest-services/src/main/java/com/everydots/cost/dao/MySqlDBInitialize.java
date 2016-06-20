package com.everydots.cost.dao;

import com.everydots.cloud.beans.MySqlDataSourceBean;
import com.everydots.cloud.service.RDSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MySqlDBInitialize {

    private RDSService rdsService = new RDSService();
    @Autowired
    private DataSourceClient dbClient;

    private MySqlDataSourceBean dataSource;


    public void init() throws IOException {
        //init RDS database
        initRDSDatabase();
    }

    private void initRDSDatabase() throws IOException {
        if (!rdsService.hasDBInstance()) {
            MySqlDataSourceBean mySqlDataSourceBean = rdsService.launchDBInstance();
            this.dataSource = mySqlDataSourceBean;
        } else {
            this.dataSource = rdsService.getDataSourceBean();
        }
        if (!dbClient.tableInitialized(dataSource)) {
            dbClient.initTable(dataSource);
        }
    }

}
