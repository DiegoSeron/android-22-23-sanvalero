package com.example.mvp.presenter;

import com.example.mvp.contract.LoginContract;
import com.example.mvp.model.pojo.Film;
import com.example.mvp.model.pojo.User;

public class LoginPresenter implements LoginContract.Presenter, LoginContract.Model.OnLoginUserListener{
    @Override
    public void login(User user) {

    }

    @Override
    public void lstFilms(Film film) {

    }
}
