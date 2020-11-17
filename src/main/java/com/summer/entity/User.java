package com.summer.entity;

import lombok.Data;
/**
 * @packageName: summer
 * @author: hyb
 * @date: 2020-11-12 下午 3:31
 * @description: 用户
 */
@Data
public class User {
    private int id;
    private String name;
    private String isAdmin;
    private int roleId;
}
