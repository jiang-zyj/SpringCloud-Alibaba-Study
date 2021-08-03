package com.zyj.springCloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
public class PaymentMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
    }

}
