package com.example.aop.services;

import com.example.aop.dao.UserDao;
import com.example.aop.entity.User;
import com.example.aop.utils.LogBeforeMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AppInitializator {

    @Autowired
    UserDao userDao;


    @Autowired
    UserSevice userSevice;


    @PostConstruct
    public void init() {
        userSevice.init();
    }
}
