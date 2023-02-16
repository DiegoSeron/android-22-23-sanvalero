package com.example.mvp.model;

import com.example.mvp.contract.LoginContract;
import com.example.mvp.model.pojo.User;

public class LoginModel implements LoginContract.Model {

    @Override
    public void findUserWS(User user, OnLoginUserListener onLoginUserListener) {

    }
}
