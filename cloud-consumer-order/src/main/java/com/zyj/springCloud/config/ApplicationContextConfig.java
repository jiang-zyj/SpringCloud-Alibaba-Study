package com.zyj.springCloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: Cloud2020
 * @ClassName ApplicationContextConfig
 * @author: YaJun
 * @Date: 2021 - 07 - 30 - 9:52
 * @Package: com.zyj.springCloud.config
 * @Description:
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * loadBalanced 开启RestTemplate的负载均衡功能
     * @return
     */

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
