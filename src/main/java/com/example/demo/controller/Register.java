package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Register {

    @GetMapping("entry") // /entry
    public String showView(){
        return "entry";
    }
}
