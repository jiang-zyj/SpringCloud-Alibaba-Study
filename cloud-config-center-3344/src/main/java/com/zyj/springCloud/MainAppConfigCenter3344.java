package com.zyj.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: Cloud2020
 * @ClassName MainAppConfigCenter3344
 * @author: YaJun
 * @Date: 2021 - 08 - 07 - 21:22
 * @Package: com.zyj.springCloud
 * @Description:
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class MainAppConfigCenter3344 {
    public static void main(String[] args) {
        SpringApplication.run(MainAppConfigCenter3344.class, args);
    }
}
