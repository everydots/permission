package com.everydots.cost.dao;

import com.everydots.cost.domain.User;

public interface UserDao {
    public User getUser(String username);

    String insertUser(final User user);
}
