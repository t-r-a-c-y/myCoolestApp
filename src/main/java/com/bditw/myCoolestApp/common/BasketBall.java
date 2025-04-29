package com.bditw.myCoolestApp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

@Controller

public class BasketBall implements Coach {
    @Override
    public String getDailyScheadule() {
        return "Basketball is one hour";
    }
    public BasketBall() {
        System.out.println("The name" + getClass().getSimpleName());
    }
}
