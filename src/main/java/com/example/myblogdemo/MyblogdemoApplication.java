package com.example.myblogdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.myblogdemo.dao")
public class MyblogdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyblogdemoApplication.class, args);
    }

}
