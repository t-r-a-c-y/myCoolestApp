package com.bditw.myCoolestApp.controller;

import com.bditw.myCoolestApp.common.BasketBall;
import com.bditw.myCoolestApp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController{
    private Coach coach;

    @Autowired
    public DemoController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/getCoach")
    public String getCoach() {
        return coach.getDailyScheadule();
    }

    @RestController
    public static class FunRestController {
        @GetMapping("/")
        public String helloWorld(){
            return "Hello World";
        }


    }
}
