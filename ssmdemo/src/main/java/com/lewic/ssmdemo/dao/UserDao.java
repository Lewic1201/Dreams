package com.lewic.ssmdemo.dao;

import com.lewic.ssmdemo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> selectUsers();
    User selectUserById(Integer userId);
}
