package com.javaye.clientapi.feign;

import com.javaye.clientapi.domain.Register;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: Java页大数据
 * @Date: 2023-02-14:1:12
 * @Describe:
 */
@FeignClient(value = "register-server")  // 请求的服务名
public interface MyFeign {
    @GetMapping(value = "/query/{str}")  // 请求的路径，还可以加参数
    public Register[] feginForArray_api(@PathVariable("str") String str); // 返回的类型以及参数传递
}
