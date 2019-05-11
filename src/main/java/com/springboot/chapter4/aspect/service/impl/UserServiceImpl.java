package com.springboot.chapter4.aspect.service.impl;

import com.springboot.chapter4.aspect.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void manyAspects() {
        System.out.println("测试多个切面顺序");
    }
}
