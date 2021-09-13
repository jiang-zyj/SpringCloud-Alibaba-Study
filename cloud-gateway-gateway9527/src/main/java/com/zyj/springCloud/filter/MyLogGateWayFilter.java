package com.zyj.springCloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @program: Cloud2020
 * @ClassName MyLogGateWayFilter
 * @author: YaJun
 * @Date: 2021 - 08 - 07 - 20:24
 * @Package: com.zyj.springCloud.filter
 * @Description:
 */
@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {

    /**
     * 过滤器
     * @param exchange
     * @param chain
     * @return
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("******come in MyLogGatewayFilter：" + new Date());
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        if (username == null) {
            log.info("******用户名为null，非法用户o(╥﹏╥)o");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }

        return chain.filter(exchange);
    }

    /**
     * 优先级，值越低优先级越高
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
