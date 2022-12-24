package com.javaye.info.controller;

import com.javaye.clientapi.domain.Info;
import com.javaye.info.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Java页大数据
 * @Date: 2022-12-24:23:15
 * @Describe:
 */
@RestController
public class InfoController {
    @Autowired
    InfoService infoService;
    @GetMapping("/query/infoAll")
    public List<Info> queryInfoAll(){
        return infoService.selectAll();
    }
}
