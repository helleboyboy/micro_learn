package com.javaye.info.controller;

import com.javaye.clientapi.domain.UnionInfoAndRegister;
import com.javaye.info.service.UnionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Java页大数据
 * @Date: 2022-12-25:20:26
 * @Describe:
 */
@RestController
public class UnionController {
    @Autowired
    UnionService unionService;

    @GetMapping("/query/unionAll")
    public List<UnionInfoAndRegister> selectAll(){
        return unionService.selectAll();
    }
}
