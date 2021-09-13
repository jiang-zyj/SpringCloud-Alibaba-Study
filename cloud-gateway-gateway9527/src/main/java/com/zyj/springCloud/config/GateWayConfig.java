package com.zyj.springCloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: Cloud2020
 * @ClassName GateWayConfig
 * @author: YaJun
 * @Date: 2021 - 08 - 07 - 17:00
 * @Package: com.zyj.springCloud.config
 * @Description: 编码的形式配置路由网关，但是出错了
 */
@Configuration
public class GateWayConfig {

    /**
     * 配置了一个id为path_route_zyj的路由规则
     * 当访问地址http://localhost:9527/guonei时会自动转发到地址：http://news.baidu.com/guonei
     *
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();

        routes.route("path_route_zyj", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();

        return routes.build();
    }

}
