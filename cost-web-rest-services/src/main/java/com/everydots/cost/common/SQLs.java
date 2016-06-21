package com.everydots.cost.common;

public class SQLs {
    public static final String CREATE_COST_TABLE_SQL =
            "create table cost_services (id VARCHAR(32) ,service_name VARCHAR(100) ,cost DOUBLE)";
    public static final String INSERT_COST_SQL = "insert into cost_services(id,name,cost) values(?,?,?)";
}
