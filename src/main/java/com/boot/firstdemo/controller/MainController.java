package com.boot.firstdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class MainController {
    int counter = 1;

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
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String date = localDateTime.format(dateFormatter);
        String time = localDateTime.format(timeFormatter);

        model.addAttribute("counter", counter++);
        model.addAttribute("dateTime", localDateTime);
        model.addAttribute("date", date);
        model.addAttribute("time", time);

        System.out.println("this is home page");
        return "about";
    }


}
