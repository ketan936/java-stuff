package com.example.aop.services;

import com.example.aop.dao.UserDao;
import com.example.aop.entity.User;
import com.example.aop.utils.LogBeforeMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSevice {

    @Autowired
    UserDao userDao;



    @LogBeforeMethod
    public void init() {
        User user1 = User.builder().address("address1").name("name1").build();
        User user2 = User.builder().address("address2").name("name2").build();

        userDao.saveAndFlush(user1);
        userDao.saveAndFlush(user2);
    }
}
