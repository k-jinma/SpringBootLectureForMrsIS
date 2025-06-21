package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class Hello {

    @GetMapping("helloView")
    public String helloView(){
        return "helloView";
    }

    @GetMapping("main")
    public String main(){
        return "main";
    }
}
