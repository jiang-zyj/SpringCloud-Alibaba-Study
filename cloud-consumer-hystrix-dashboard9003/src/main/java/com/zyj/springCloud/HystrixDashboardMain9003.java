package com.zyj.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @program: Cloud2020
 * @ClassName HystrixDashboardMain9003
 * @author: YaJun
 * @Date: 2021 - 08 - 04 - 10:02
 * @Package: com.zyj.springCloud
 * @Description:
 */
@SpringBootApplication
// 开启 HystrixDashboard
@EnableHystrixDashboard
public class HystrixDashboardMain9003 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9003.class, args);
    }

}
