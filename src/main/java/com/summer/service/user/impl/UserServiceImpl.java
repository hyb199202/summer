package com.summer.service.user.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONObject;
import com.summer.dao.UserDao;
import com.summer.entity.User;
import com.summer.service.user.UserService;
import com.summer.util.RedisUtil;
import com.summer.util.SMSResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
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

    @Override
    public String addUserRedis(String name) {
        JSONObject resultMap = new JSONObject();
        JSONObject object = new JSONObject();
        String now = DateUtil.now();
        object.put("now", now);
        object.put("name", name);
        boolean dateTime = RedisUtil.set("dateTime", object);
        logger.info("redis cache status->" + dateTime);
        logger.error("redis cache status->" + dateTime);
        if (dateTime) {
            resultMap.put("resultCode", "0");
            resultMap.put("resultMsg", "success");
            return SMSResultUtil.result("0", resultMap, null);
        }
        resultMap.put("resultCode", "1");
        resultMap.put("resultMsg", "failed");
        return SMSResultUtil.result("0", resultMap, null);
    }

    @Override
    public String getUserRedis(String name) {
        return null;
    }

}
