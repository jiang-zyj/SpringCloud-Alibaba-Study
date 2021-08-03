package com.zyj.springCloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @program: Cloud2020
 * @ClassName LoadBalancer
 * @author: YaJun
 * @Date: 2021 - 08 - 02 - 23:05
 * @Package: com.zyj.lb
 * @Description:
 */
public interface LoadBalancer {

    ServiceInstance instance(List<ServiceInstance> serviceInstances);

}
