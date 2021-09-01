package com.zyj.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: Cloud2020
 * @ClassName StreamMQMain8803
 * @author: YaJun
 * @Date: 2021 - 08 - 10 - 20:22
 * @Package: com.zyj.springCloud
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8803.class, args);
    }

}
