package com.example.mvc_netflix_1.model;

import com.example.mvc_netflix_1.model.pojo.User;

public class UserWS {
    private User user;

    public User getUserWS(){
        user = new User();
        user.setUser("PERICO");
        user.setPassword("PALOTES");
        return user;
    }

}
