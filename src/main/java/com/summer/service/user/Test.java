package com.summer.service.user;

import com.alibaba.fastjson.JSONObject;
import com.summer.util.JsonUtil;

/**
 * @packageName: summer
 * @author: hyb
 * @date: 2020-12-15 下午 5:51
 * @description:
 */
public class Test {
    public static void main(String[] args) {

//        String readJsonFile = JsonUtil.readJsonFile("./src/main/resources/upload/json.json");
//        JSONObject jsonObject = JSONObject.parseObject(readJsonFile);
//        System.out.println(jsonObject);
        JSONObject json = new JSONObject();
        json.put("name", "A1");
        json.put("value", "B1");
        boolean jsonFile = JsonUtil.createJsonFile(json.toString(), "./src/main/resources/upload", "a.json");
        System.out.println(jsonFile);
    }
}
