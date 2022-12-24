package com.javaye.info.service.impl;

import com.javaye.clientapi.domain.Info;
import com.javaye.info.mapper.InfoMapper;
import com.javaye.info.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Java页大数据
 * @Date: 2022-12-24:23:14
 * @Describe:
 */
@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    InfoMapper infoMapper;
    @Override
    public List<Info> selectAll() {
        return infoMapper.selectList(null);
    }
}
