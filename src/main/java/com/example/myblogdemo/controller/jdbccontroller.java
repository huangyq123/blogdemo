package com.example.myblogdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;

@Controller
public class jdbccontroller {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping ("/users/insert")
    public Object insert(String name,String password){
        jdbcTemplate.execute("insert into tb_user(name,password) value(\""+name+"\",\""+password+"\")");
        return true;
    }
}
