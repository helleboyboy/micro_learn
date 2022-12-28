package com.javaye.info.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.javaye.clientapi.domain.Register;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Java页大数据
 * @Date: 2022-12-25:20:32
 * @Describe:
 *      register:  id,name,sex
 */
@Mapper
public interface RegisterMapper extends BaseMapper<Register> {
}
