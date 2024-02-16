package com.example.Environment02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/welcome")
public class WelcomeController {

    @Autowired
    private Environment environment;

    @GetMapping("/get")
    public String get(){
        return environment.getProperty("myCustomVarTree.welcomeMsg");
    }

}