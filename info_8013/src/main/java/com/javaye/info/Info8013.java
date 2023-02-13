package com.javaye.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: Java页大数据
 * @Date: 2022-12-20:22:30
 * @Describe:
 */
@SpringBootApplication
@EnableFeignClients
public class Info8013 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Info8013.class);
    }
}
