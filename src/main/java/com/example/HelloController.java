package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello World from Java application running on EKS!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from EKS!";
    }
}
