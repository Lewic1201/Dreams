package com.lewic.ssmdemo.service;

import com.lewic.ssmdemo.model.User;

import java.util.List;

public interface  UserService {
    List<User> selectUsers();
    User selectUserById(Integer userId);
}
