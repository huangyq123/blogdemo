package com.example.myblogdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hellocontroller {

    @GetMapping("/info")
    @ResponseBody
    public String info(){
        return "this is a controller demo";
    }

}
