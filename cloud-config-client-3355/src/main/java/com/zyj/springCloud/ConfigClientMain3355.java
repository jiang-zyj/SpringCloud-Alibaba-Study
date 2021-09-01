package com.zyj.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @program: Cloud2020
 * @ClassName ConfigClientMain3355
 * @author: YaJun
 * @Date: 2021 - 08 - 08 - 12:49
 * @Package: com.zyj.springCloud
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3355.class, args);
    }


//    @Bean
//    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//
//        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
//
//        c.setIgnoreUnresolvablePlaceholders(true);
//
//        return c;
//
//    }
}
