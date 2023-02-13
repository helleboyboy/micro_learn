//package com.javaye.info.feign;
//
//import com.javaye.clientapi.domain.Register;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
///**
// * @Author: Java页大数据
// * @Date: 2023-02-13:21:45
// * @Describe:
// */
//@Component
//@FeignClient(value = "register-server")  // 请求的服务名
//public interface MyFeign {
//    @GetMapping(value = "/query/{str}")  // 请求的路径，还可以加参数
//    public Register[] feginForArray(@PathVariable("str") String str); // 返回的类型以及参数传递
//}
