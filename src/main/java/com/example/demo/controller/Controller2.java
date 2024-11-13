package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {

    @PostMapping("/hello")
    public String hello() {
        return "hello";
    }
}
