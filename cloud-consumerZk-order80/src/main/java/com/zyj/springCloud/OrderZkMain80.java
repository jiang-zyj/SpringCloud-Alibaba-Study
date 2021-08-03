package com.zyj.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.annotation.Order;

/**
 * @program: Cloud2020
 * @ClassName OrderZkMain80
 * @author: YaJun
 * @Date: 2021 - 08 - 02 - 20:36
 * @Package: com.zyj.springCloud
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZkMain80.class, args);
    }

}
