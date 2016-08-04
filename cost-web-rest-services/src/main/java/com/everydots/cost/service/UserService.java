package com.everydots.cost.service;

import com.everydots.cost.beans.User;

/**
 * Created by xiaomingxing on 16/8/3.
 */
public interface UserService {

   boolean validateUser(User user);

   Object addUser(User user);
}
