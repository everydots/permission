package com.everydots.cost.service;

import com.everydots.cost.models.SignInModel;
import com.everydots.cost.models.SignUpModel;

/**
 * Created by xiaomingxing on 16/8/3.
 */
public interface UserService {

    boolean validateUser(SignInModel user);

    String addUser(SignUpModel signUpModel);
}
