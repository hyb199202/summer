package com.summer.controller;

import com.summer.entity.User;
import com.summer.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @packageName: summer
 * @author: hyb
 * @date: 2020-11-12 下午 3:41
 * @description:
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(@RequestParam int id) {
        List<User> user = userService.getUserById(id);
        return user;
    }
    @RequestMapping(value = "/findUserByName", method = RequestMethod.POST)
    public Object login(@RequestParam String name) {
        User user = userService.findUserByName(name);
        return user;
    }

}
