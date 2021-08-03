package com.zyj.springCloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: SpringCloud
 * @ClassName PaymentMain8001
 * @author: YaJun
 * @Date: 2021 - 07 - 28 - 22:25
 * @Package: com.zyj.springCloud
 * @Description:
 */
@SpringBootApplication
@MapperScan(basePackages = "com.zyj.springCloud.dao")
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
    }

}
