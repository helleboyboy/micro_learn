package com.javaye.info.service.impl;

import com.javaye.clientapi.domain.Register;
import com.javaye.clientapi.domain.UnionInfoAndRegister;
import com.javaye.info.mapper.RegisterMapper;
import com.javaye.info.mapper.UnionInfoRegisterMapper;
import com.javaye.info.service.UnionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Java页大数据
 * @Date: 2022-12-25:20:25
 * @Describe:
 */
@Service
public class UnionServiceImpl implements UnionService {
    @Autowired
    UnionInfoRegisterMapper unionInfoRegisterMapper;
    @Autowired
    RegisterMapper registerMapper;

    @Override
    public List<UnionInfoAndRegister> selectAll() {
        List<UnionInfoAndRegister> unionInfoAndRegisters = unionInfoRegisterMapper.selectList(null);
        List<Register> registers = registerMapper.selectList(null);
        for (UnionInfoAndRegister unionInfoAndRegister : unionInfoAndRegisters) {
            String name = unionInfoAndRegister.getName();
            for (Register register : registers) {
                if (register.getName().equals(name)) {
                    unionInfoAndRegister.setRegister(register);
                }
            }
        }
        return unionInfoAndRegisters;
    }
}
