package com.in60minutes.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "Hello, Welcome to Spring Boot Demo...";
    }
}
