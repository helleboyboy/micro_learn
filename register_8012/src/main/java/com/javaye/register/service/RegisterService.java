package com.javaye.register.service;

import com.javaye.clientapi.domain.Register;

import java.util.List;

/**
 * @Author: Java页大数据
 * @Date: 2022-12-24:22:33
 * @Describe:
 */
public interface RegisterService {
    /**
     *
     * @return 获取所有值
     */
    List<Register> selectList();
}
