package com.mark.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * build by mark time by 2020/1/4
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping("/getter")
    @ResponseBody
    public String getUser(){
        return "Hello";
    }
}
