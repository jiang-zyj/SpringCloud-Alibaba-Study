package com.zyj.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: Cloud2020
 * @ClassName NacosProviderDemoApplication
 * @author: YaJun
 * @Date: 2021 - 08 - 16 - 21:09
 * @Package: com.zyj.springCloud
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9002.class, args);
    }


}
