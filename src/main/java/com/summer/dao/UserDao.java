package com.summer.dao;

import com.summer.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserDao {
    List<User> getUserById(int id);
}
