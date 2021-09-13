package com.zyj.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: Cloud2020
 * @ClassName ZkPaymentMain8004
 * @author: YaJun
 * @Date: 2021 - 08 - 02 - 20:14
 * @Package: com.zyj.springCloud
 * @Description: EnableDiscoveryClient注解用于向使用consul或者zookeeper作为注册中心时注册服务
 */
@SpringBootApplication
@EnableDiscoveryClient  // 该注解用于向使用 consul 或者 zookeeper 作为注册中心时注册服务
public class ZkPaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(ZkPaymentMain8004.class, args);
    }
}
