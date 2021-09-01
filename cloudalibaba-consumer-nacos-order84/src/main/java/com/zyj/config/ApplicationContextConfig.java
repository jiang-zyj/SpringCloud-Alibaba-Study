package com.zyj.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: Cloud2020
 * @ClassName ApplicationContextConfig
 * @author: YaJun
 * @Date: 2021 - 08 - 23 - 17:08
 * @Package: com.zyj.config
 * @Description:
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
