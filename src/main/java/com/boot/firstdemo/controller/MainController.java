package com.boot.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    static int counter = 1;

    @RequestMapping("/")
    public String root(){
        System.out.println("this is home page");
        return "index";
    }

    @RequestMapping("/home")
    public String home(){
        System.out.println("this  is home page");
        return "home";
    }

    @RequestMapping("/about")
    public String about(Model model){
        model.addAttribute("counter", counter++);
        System.out.println("this is home page");
        return "about";
    }


}
