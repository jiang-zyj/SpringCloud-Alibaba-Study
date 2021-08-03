package com.zyj.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: Cloud2020
 * @ClassName OrderConsulMain
 * @author: YaJun
 * @Date: 2021 - 08 - 02 - 10:03
 * @Package: com.zyj.springCloud
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain.class, args);
    }

}
