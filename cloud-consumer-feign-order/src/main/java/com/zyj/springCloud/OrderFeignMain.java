package com.zyj.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: Cloud2020
 * @ClassName OrderFeignMain
 * @author: YaJun
 * @Date: 2021 - 08 - 03 - 11:12
 * @Package: com.zyj.springCloud
 * @Description:
 */
@SpringBootApplication
// 激活 Feign 的注解，需要加在启动类上
@EnableFeignClients
public class OrderFeignMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain.class, args);
    }
}
