package com.example.myblogdemo.controller;

import com.example.myblogdemo.dao.UserDao;
import com.example.myblogdemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class mybatiscontroller {

    @Resource
    private UserDao userDao;

    @GetMapping("/users/mybatis/queryAll")
    public List<User> queryAll(){
        return userDao.findAllUsers();
    }
}
