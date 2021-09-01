package com.zyj.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: Cloud2020
 * @ClassName StreamMQMain8802
 * @author: YaJun
 * @Date: 2021 - 08 - 09 - 22:03
 * @Package: com.zyj.springCloud
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8802.class, args);
    }

}
