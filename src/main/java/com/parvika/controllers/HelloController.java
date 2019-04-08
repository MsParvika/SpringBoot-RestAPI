package com.parvika.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @RequestMapping("/hello")
    public String greet()
    {
        return "welcome!";
    }
}
