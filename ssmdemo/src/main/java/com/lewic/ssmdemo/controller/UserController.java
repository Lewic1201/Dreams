package com.lewic.ssmdemo.controller;

import com.lewic.ssmdemo.model.User;
import com.lewic.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/ssm")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "hello")
    public User hello() {
        User user = new User();
        user.setUsername("test");
        return user;
    }

    @RequestMapping(value = "getUser")
    public User getUser() {
        return userService.selectUserById(1);
    }

    @RequestMapping(value = "getAllUser")
    public List<User> getUsers() {
        return userService.selectUsers();
    }
}


