package com.example.aop.controller;


import com.example.aop.dao.UserDao;
import com.example.aop.entity.User;
import com.example.aop.utils.LogBeforeMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    UserDao userDao;

    @GetMapping("/get")
    @LogBeforeMethod
    public List<User> getAllUser() {
        return userDao.findAll();
    }

}
