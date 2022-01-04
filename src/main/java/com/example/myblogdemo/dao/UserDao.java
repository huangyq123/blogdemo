package com.example.myblogdemo.dao;

import com.example.myblogdemo.entity.User;

import java.util.List;

public interface UserDao {

    List<User> findAllUsers();
}
