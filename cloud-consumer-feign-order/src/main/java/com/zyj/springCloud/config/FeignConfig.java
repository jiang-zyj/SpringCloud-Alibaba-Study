package com.zyj.springCloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: Cloud2020
 * @ClassName FeignConfig
 * @author: YaJun
 * @Date: 2021 - 08 - 03 - 21:21
 * @Package: com.zyj.springCloud.config
 * @Description: 日志增强
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
