package com.springboot.chapter4.aspect.validator;

import com.springboot.chapter4.pojo.User;

public interface UserValidator {
     boolean validator(User user);
}
