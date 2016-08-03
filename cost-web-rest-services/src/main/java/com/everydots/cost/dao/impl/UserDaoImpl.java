package com.everydots.cost.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.everydots.cost.beans.User;
import com.everydots.cost.common.SQLs;
import com.everydots.cost.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User getUser(String username) {
        return jdbcTemplate.queryForObject(SQLs.QUERY_USER, new Object[]{username},
                new RowMapper<User>() {
                    @Override
                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                        User user = new User();
                        user.setUsername(rs.getString("username"));
                        user.setPassword(rs.getString("password"));
                        user.setIsRemember(rs.getBoolean("isRemember"));
                        return user;
                    }
                });
    }
}
