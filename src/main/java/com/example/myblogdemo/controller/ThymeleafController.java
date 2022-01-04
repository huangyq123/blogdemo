package com.example.myblogdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ThymeleafController {

    @RequestMapping(value="/thymeleaf")
    public String hello(HttpServletRequest request,@RequestParam(value = "description",required = false,defaultValue = "springboot-thymeleaf") String description){
        request.setAttribute("description","传值为："+description);
        return "thymeleaf";
    }
}
