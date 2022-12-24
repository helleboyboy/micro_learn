package com.javaye.register.service.impl;

import com.javaye.clientapi.domain.Register;
import com.javaye.register.mapper.RegisterMapper;
import com.javaye.register.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Java页大数据
 * @Date: 2022-12-24:22:34
 * @Describe:
 */
@Service
public class RegisterServiceImpl implements RegisterService{
    @Autowired
    RegisterMapper registerMapper;

    @Override
    public List<Register> selectList() {
        return registerMapper.selectList(null);
    }
}
