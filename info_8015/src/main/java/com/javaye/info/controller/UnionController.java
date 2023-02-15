package com.javaye.info.controller;

import com.javaye.clientapi.domain.UnionInfoAndRegister;
import com.javaye.info.service.UnionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Java页大数据
 * @Date: 2022-12-25:20:26
 * @Describe:
 */
@RestController
@RefreshScope
public class UnionController {
    @Autowired
    UnionService unionService;

    @GetMapping("/query/unionAll")
    public List<UnionInfoAndRegister> selectAll(@RequestHeader(value = "javaye", required = false, defaultValue = "默认值") String javaye){
        System.out.println("javaye:" + javaye);
        return unionService.selectAll();
    }


    @Value("${a.b}")
    private String testConfig;

    @Value("${a.c}")
    private String cccc;
    @GetMapping("/getConfig")
    public String getConfig(){
        return testConfig + "~" + cccc;
    }
}
