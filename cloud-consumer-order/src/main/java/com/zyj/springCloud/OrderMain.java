package com.zyj.springCloud;

import com.zyj.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: Cloud2020
 * @ClassName OrderMain
 * @author: YaJun
 * @Date: 2021 - 07 - 30 - 9:47
 * @Package: com.zyj.springCloud.order
 * @Description:
 * 在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效，形如：
 */
@SpringBootApplication
@EnableEurekaClient
// name 为生产者服务的服务名称     configuration 为配置类的类名
@RibbonClient(name = "cloud-payment-service", configuration = MyselfRule.class)
public class OrderMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class, args);
    }

}
