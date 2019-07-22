package com.lzr.learnGuns.controller;

import com.lzr.learnGuns.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/index")
public class HelloWorld {

    @Resource
    UserService userService;

    @RequestMapping("/index")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("email", "apk2sf@163.com");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public Object getUser(String name) {
        return userService.getByNmae(name);
    }

}
