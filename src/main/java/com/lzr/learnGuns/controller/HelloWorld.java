package com.lzr.learnGuns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {

    @RequestMapping("/index")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("email", "apk2sf@163.com");
        modelAndView.setViewName("index");
        return modelAndView;
        
    }

}
