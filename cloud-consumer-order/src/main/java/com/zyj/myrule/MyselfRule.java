package com.zyj.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: Cloud2020
 * @ClassName MyselfRule
 * @author: YaJun
 * @Date: 2021 - 08 - 02 - 10:50
 * @Package: com.zyj.myrule
 * @Description:
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule() {
        // 定义为随机
        // Ribbon的负载均衡机制为：
        //  负载均衡原理：rest接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标
        // 每次服务重启后，rest接口计数从 1 开始
        return new RandomRule();
    }

}
