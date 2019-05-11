package com.springboot.chapter4.aspect.controller;

import com.springboot.chapter4.aspect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/manyAspects")
    public void manyAspects() {
        userService.manyAspects();
    }

}
