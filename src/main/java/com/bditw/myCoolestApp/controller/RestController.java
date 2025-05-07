package com.bditw.myCoolestApp.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
//    public String proccessForm(){
    //2nd method
//    public String proccessForm(HttpServletRequest request, Model model){

    //3rd method
    public String proccessForm(@RequestParam("studentName") String name,Model model){

//        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        model.addAttribute("studentName", name);
        return "helloWorld";
    }
}


