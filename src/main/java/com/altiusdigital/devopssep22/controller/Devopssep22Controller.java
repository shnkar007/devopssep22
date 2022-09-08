package com.altiusdigital.devopssep22.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/devopssep22")
public class Devopssep22Controller {
    @GetMapping(path="/greet",produces="application/json")
    public String greet(){
		System.out.println("Hello 123");
        return "Hello";
    }
}
