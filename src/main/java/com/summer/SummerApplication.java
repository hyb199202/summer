package com.summer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @packageName: summer
 * @author: hyb
 * @date: 2020-11-12 下午 3:16
 * @description: 启动类
 */
@MapperScan("com.summer.dao")
@SpringBootApplication
public class SummerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SummerApplication.class, args);
    }
}
