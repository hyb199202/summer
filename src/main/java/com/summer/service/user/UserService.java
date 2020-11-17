package com.summer.service.user;

import com.summer.entity.User;

import java.util.List;

/**
 * @packageName: summer
 * @author: hyb
 * @date: 2020-11-12 下午 3:45
 * @description:
 */
public interface UserService {
    List<User> getUserById(int id);
}
