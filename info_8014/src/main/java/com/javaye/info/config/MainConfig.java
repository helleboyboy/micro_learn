package com.javaye.info.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Java页大数据
 * @Date: 2022-12-20:22:31
 * @Describe:
 */
@Configuration
public class MainConfig {

    /**
     *  往spring容器注入 restTemplate对象
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule myIRule(){
//        return new RandomRule();
//    }
}
