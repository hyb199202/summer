package com.summer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @packageName: summer
 * @author: hyb
 * @date: 2020-11-18 下午 4:50
 * @description:
 */
@Data
@AllArgsConstructor
public class Permissions {
    private String id;
    private String permissionsName;
    private List<Role> roles;
}
