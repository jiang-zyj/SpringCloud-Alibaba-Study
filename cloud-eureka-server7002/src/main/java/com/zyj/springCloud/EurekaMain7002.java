package com.zyj.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: Cloud2020
 * @ClassName EurekaMain7002
 * @author: YaJun
 * @Date: 2021 - 08 - 01 - 13:06
 * @Package: com.zyj.springCloud
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class, args);
    }

}
