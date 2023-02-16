package com.javaye.gateway.globalFilter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @Author: Java页大数据
 * @Date: 2023-02-17:0:40
 * @Describe:
 */
@Component
@Order(111111)
public class MyGlobalFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();
//        发送请求需要带有 参数javaye ; 如：http://localhost:8018/query/unionAll?javaye=bigdata1
        MultiValueMap<String, String> queryParams = request.getQueryParams();
        String javaye = queryParams.getFirst("javaye");
        if ("bigdata1".equalsIgnoreCase(javaye)){
            return chain.filter(exchange);
        }
//        规范代码，客户体验，401
        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//        设置结束
        return exchange.getResponse().setComplete();
    }
}
