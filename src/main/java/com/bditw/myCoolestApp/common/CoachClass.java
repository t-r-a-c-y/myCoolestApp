package com.bditw.myCoolestApp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
@Primary
public class CoachClass implements Coach {
    @Override
    public String getDailyScheadule() {
        return "We work out 30 minutes per day";
    }

    public CoachClass() {
        System.out.println("The name" + getClass().getSimpleName());
    }
}
