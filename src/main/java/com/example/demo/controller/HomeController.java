package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Connection;

@Controller
public class HomeController {
    
    //Test for commit
    //Test for commit

    public String name= "anna";

    @GetMapping("/")
    public String home(){

        return "index";
    }

    public void doSomething(){
            name = "anna changed";
    }

}
