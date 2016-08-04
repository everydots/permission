package com.everydots.cost.service;

import com.everydots.cost.beans.User;
import com.everydots.cost.models.UserModel;

/**
 * Created by xiaomingxing on 16/8/3.
 */
public interface UserService {

   boolean validateUser(User user);

   String addUser(UserModel userModel);
}
