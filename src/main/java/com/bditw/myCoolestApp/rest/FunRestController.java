package com.bditw.myCoolestApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }
}
