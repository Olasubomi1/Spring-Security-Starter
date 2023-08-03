package com.olasubomi.springbootsecurity.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
    @GetMapping(value = "/")
    public String hello(){
        System.out.println("soft");
        return "Hello";
    }
}
