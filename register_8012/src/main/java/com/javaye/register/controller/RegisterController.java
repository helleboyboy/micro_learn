package com.javaye.register.controller;

import com.javaye.clientapi.domain.Register;
import com.javaye.register.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Java页大数据
 * @Date: 2022-12-24:22:49
 * @Describe:
 */
@RestController
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @GetMapping("/query/registerAll")
    public List<Register> registerAll(){
        System.out.println("121212");
        return registerService.selectList();
    }
}
