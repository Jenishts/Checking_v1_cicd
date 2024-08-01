package com.example.springboot_cicd_check.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

record Name(String name, Integer id){}
@RestController

public class CheckController {

    @Autowired
    Environment environment;

    @GetMapping
    public String getHello(){
        return "Hello World from get url " + environment.getProperty("server.port");
    }

    @PostMapping
    public Name postHello(@RequestBody Name name){
        return name;
    }


}
