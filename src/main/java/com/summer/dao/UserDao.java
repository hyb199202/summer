package com.summer.dao;

import com.summer.entity.User;

import java.util.List;

public interface UserDao {
    List<User> getUserById(int id);

    User findUserByName(String name);
}
