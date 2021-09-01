package com.zyj.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: Cloud2020
 * @ClassName ConfigClientMain3366
 * @author: YaJun
 * @Date: 2021 - 08 - 08 - 21:30
 * @Package: com.zyj.springCloud
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3366 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3366.class, args);
    }

}
