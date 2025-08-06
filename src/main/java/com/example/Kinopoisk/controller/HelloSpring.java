package com.example.Kinopoisk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpring {

    @ResponseBody
    @RequestMapping(path = "/hello")
    public String hello(){
        return "Hello Spring";
    }
}
