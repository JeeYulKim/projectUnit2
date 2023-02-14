package com.practice.projectUnit2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @RequestMapping("/")
    public String HelloWorld() {
        return "TO-do Application !";
    }
}
