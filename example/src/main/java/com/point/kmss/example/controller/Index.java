package com.point.kmss.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Park on 2019-5-22.
 */
@Controller
public class Index {
    @RequestMapping(path = {"index"})
    public String index(){
        System.out.println("index跳转");
        return "index";
    }
    @RequestMapping(path = {"/hello"})
    public ModelAndView hello(){
        System.out.println("index跳转");
        return  new ModelAndView("index");
    }
}
