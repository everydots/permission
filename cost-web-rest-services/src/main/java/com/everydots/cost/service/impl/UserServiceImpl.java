package com.everydots.cost.service.impl;

import com.everydots.cost.domain.User;
import com.everydots.cost.mappers.UserMapper;
import com.everydots.cost.model.SignInModel;
import com.everydots.cost.model.SignUpModel;
import com.everydots.cost.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userMapper")
    private UserMapper userDao;

    public boolean validateUser(SignInModel signInModel) {
        User existingUser = userDao.getUser(signInModel.getUsername());
        return existingUser != null && signInModel.getPassword().equals(existingUser.getPassword());
    }

    @Override
    public int addUser(SignUpModel signUpModel) {
        User user = new User();
        user.setUsername(signUpModel.getUsername());
        user.setPassword(signUpModel.getPassword());
        user.setEmail(signUpModel.getEmail());
        return userDao.insertUser(user);
    }
}
