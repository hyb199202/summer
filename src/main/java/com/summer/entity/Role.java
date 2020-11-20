package com.summer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @packageName: summer
 * @author: hyb
 * @date: 2020-11-18 下午 4:48
 * @description:
 */
@Data
@AllArgsConstructor
public class Role {
    private String id;
    private String roleName;
    /**
     * 角色对应的菜单权限
     */
    private List<Permissions> Permissions;
    private List<User> users;

}
