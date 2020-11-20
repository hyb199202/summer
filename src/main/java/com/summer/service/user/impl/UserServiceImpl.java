package com.summer.service.user.impl;

import com.summer.dao.UserDao;
import com.summer.entity.User;
import com.summer.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @packageName: summer
 * @author: hyb
 * @date: 2020-11-12 下午 3:45
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public User findUserByName(String name) {
        return userDao.findUserByName(name);
    }
}
