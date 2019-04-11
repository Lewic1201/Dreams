package com.lewic.ssmdemo.service.impl;

import com.lewic.ssmdemo.dao.UserDao;
import com.lewic.ssmdemo.model.User;
import com.lewic.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User selectUserById(Integer userId) {
        return userDao.selectUserById(userId);
    }

    @Override
    public List<User> selectUsers() {
        return userDao.selectUsers();
    }
}
