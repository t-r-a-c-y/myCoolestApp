package com.bditw.myCoolestApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/BillionerFam")
    public String BillionerFam(){
        return "Gafirita James";
    }
    @GetMapping("/NumberOneThing")
    public String NumberOneThing(){
        return "Number One thing is Jesus";
    }
}
