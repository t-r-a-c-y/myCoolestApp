package com.bditw.myCoolestApp.common;

import org.springframework.stereotype.Controller;

@Controller
public class VolleyBall implements Coach{
    @Override
    public String getDailyScheadule() {
        return "VolleyBall is 1.5 hours";
    }
    public VolleyBall() {
        System.out.println("The name" + getClass().getSimpleName());
    }
}
