package com.newlight77.kata.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String createSurvey() {
        return "Hello World!";
    }

}
