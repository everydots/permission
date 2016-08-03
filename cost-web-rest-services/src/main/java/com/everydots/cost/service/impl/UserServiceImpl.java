package com.everydots.cost.service.impl;

import com.everydots.cost.beans.User;
import com.everydots.cost.dao.impl.UserDaoImpl;
import com.everydots.cost.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoImpl userDao;

    public boolean validateUser(User user) {
        User existingUser = userDao.getUser(user.getUsername());
        return user.getPassword().equals(existingUser.getPassword());
    }
}
