package com.bditw.myCoolestApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestController {
    @GetMapping("/helloW")
    public String helloWorld(Model model){
        model.addAttribute("theDate",java.time.LocalDate.now());
        return "helloWorld";
    }
    @RequestMapping("/showForm")
    public String showForm(Model model){
        return "nameForm";
    }
    @RequestMapping("/proccessForm")
    public String proccessForm(){
        return "helloWorld";
    }
}


