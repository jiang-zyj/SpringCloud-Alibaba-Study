package com.zyj.springCloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: Cloud2020
 * @ClassName ApplicationContextConfig
 * @author: YaJun
 * @Date: 2021 - 08 - 02 - 20:37
 * @Package: com.zyj.springCloud.config
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
