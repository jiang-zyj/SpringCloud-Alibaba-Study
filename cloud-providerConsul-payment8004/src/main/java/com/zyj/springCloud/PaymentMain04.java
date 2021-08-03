package com.zyj.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: Cloud2020
 * @ClassName PaymentMain04
 * @author: YaJun
 * @Date: 2021 - 08 - 02 - 9:51
 * @Package: com.zyj.springCloud
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain04 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain04.class, args);
    }

}
