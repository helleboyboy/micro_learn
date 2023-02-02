package com.javaye.info.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.javaye.clientapi.domain.UnionInfoAndRegister;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Java页大数据
 * @Date: 2022-12-25:20:23
 * @Describe:
 *
 *  info:  name,age,sex,hobby,conn_number,email_number,id_card,address
 *  register:  id,name,sex
 */
@Mapper
public interface UnionInfoRegisterMapper extends BaseMapper<UnionInfoAndRegister> {
}
