package com.example.supercoding.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping("/test")
    public String hello(){
        String text = "Hello Super Coding World";
        return text;
    }
}
