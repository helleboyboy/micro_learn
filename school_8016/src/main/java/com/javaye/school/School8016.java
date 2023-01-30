package com.javaye.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: Java页大数据
 * @Date: 2022-12-20:23:03
 * @Describe:
 */
@SpringBootApplication
@EnableEurekaServer
public class School8016 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(School8016.class);
    }
}
