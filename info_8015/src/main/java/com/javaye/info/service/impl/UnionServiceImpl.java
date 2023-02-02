package com.javaye.info.service.impl;

import com.javaye.clientapi.domain.Register;
import com.javaye.clientapi.domain.UnionInfoAndRegister;
import com.javaye.info.mapper.RegisterMapper;
import com.javaye.info.mapper.UnionInfoRegisterMapper;
import com.javaye.info.service.UnionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

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

    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<UnionInfoAndRegister> selectAll() {
        List<UnionInfoAndRegister> unionInfoAndRegisters = unionInfoRegisterMapper.selectList(null);

//        可是这个就相当于 重复开发了！！！需要改善！
//        List<Register> registers = registerMapper.selectList(null);
//        for (UnionInfoAndRegister unionInfoAndRegister : unionInfoAndRegisters) {
//            String name = unionInfoAndRegister.getName();
//            for (Register register : registers) {
////                根据name字段相等来进行组合
//                if (register.getName().equals(name)) {
//                    unionInfoAndRegister.setRegister(register);
//                }
//            }
//        }

        String url = "http://localhost:8011/query/registerAll";
        Register[] forObject = restTemplate.getForObject(url, Register[].class);
        for (UnionInfoAndRegister unionInfoAndRegister : unionInfoAndRegisters) {
            String name = unionInfoAndRegister.getName();
            for (int i = 0; i < Objects.requireNonNull(forObject).length; i++) {
                Register register = (Register) forObject[i];
                if (register.getName().equals(name)){
                    unionInfoAndRegister.setRegister(register);
                }
            }
        }

        return unionInfoAndRegisters;
    }
}
