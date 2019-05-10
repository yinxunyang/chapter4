package com.springboot.chapter4;


import com.springboot.chapter4.aspect.service.UserService;
import com.springboot.chapter4.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter4ApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testProxy() {
    }

    @Test
    public void testUserService() {
        User user = new User();
        user.setId("123");
        user.setNote("note_1");
        user.setUserName("user_name");
        userService.printUser(user);
    }

}
