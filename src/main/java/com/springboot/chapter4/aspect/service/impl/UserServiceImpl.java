package com.springboot.chapter4.aspect.service.impl;

import com.springboot.chapter4.aspect.service.UserService;
import com.springboot.chapter4.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void printUser(User user) {
        if (null == user) {
            throw new RuntimeException("检查用户参数是否为空。。。。。。");
        }
        System.out.println("id=" + user.getId());
        System.out.println("\t userName=" + user.getUserName());
        System.out.println("\t note=" + user.getNote());
    }
}
