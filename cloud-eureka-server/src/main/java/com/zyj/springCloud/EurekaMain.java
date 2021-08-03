package com.zyj.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: Cloud2020
 * @ClassName EurekaMain
 * @author: YaJun
 * @Date: 2021 - 07 - 30 - 13:53
 * @Package: com.zyj.springCloud
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain.class, args);
    }
}
