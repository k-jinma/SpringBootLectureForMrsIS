package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.form.SampleForm;

@Controller // コントローラーという機能をもつクラス
@RequestMapping("hello") // URLのパスを指定 /hello
public class Hello {

    @GetMapping("helloView") // /hello/helloView
    public ModelAndView  helloView(ModelAndView modelAndView){
        
        modelAndView.addObject("msg","タイムリーフ!!!");
        modelAndView.setViewName("helloView");
        return modelAndView;
    }

    @GetMapping("main") // /hello/main
    public String main(){
        return "main";
    }

    @GetMapping("form") // /hello/form
    public String form() {
        
        return "form";
    }

    @PostMapping("result") // /hello/result
    public String result(@RequestParam String name, Model model){
        name = name + "さん";
        model.addAttribute("msg", name);
        return "result";
    }

    @GetMapping("touroku") // /hello/touroku
    public String showView(){
        return "touroku";
    }

    @PostMapping("confirm") // /hello/confirm
    public String confirm(SampleForm f,Model model){

        model.addAttribute("form", f);
        return "confirm";
    }
}
