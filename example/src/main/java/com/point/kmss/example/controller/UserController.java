package com.point.kmss.example.controller;

import com.point.kmss.example.common.ServerResponse;
import com.point.kmss.example.models.MmallUser;
import com.point.kmss.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Park on 2019-5-23.
 */
@Controller
@RequestMapping(path = {"user/"})
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping(path = {"login"})
    public  String login(){
        return "user/login";
    }
    @RequestMapping(path = {"register"},method = RequestMethod.POST)
    public String register(@ModelAttribute MmallUser user){
        ServerResponse response = userService.register(user);
        if(response.isSuccess()){
            return  "user/login";
        }
        return  "index";
    }
}
