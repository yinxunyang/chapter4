package com.springboot.chapter4.aspect.controller;

import com.springboot.chapter4.aspect.service.UserService;
import com.springboot.chapter4.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/print")
    @ResponseBody
    public User printUser(String id, String userName, String note) {
        User user = new User();
        user.setId(id);
        user.setNote(note);
        user.setUserName(userName);
        userService.printUser(user);
        return user;
    }
}
