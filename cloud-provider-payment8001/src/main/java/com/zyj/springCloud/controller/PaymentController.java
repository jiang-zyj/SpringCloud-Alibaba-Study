package com.zyj.springCloud.controller;

import com.netflix.discovery.converters.Auto;
import com.zyj.springCloud.entities.CommonResult;
import com.zyj.springCloud.entities.Payment;
import com.zyj.springCloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @program: SpringCloud
 * @ClassName PaymentController
 * @author: YaJun
 * @Date: 2021 - 07 - 28 - 23:03
 * @Package: com.zyj.springCloud.com.zyj.springCloud.controller
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;


    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("***插入结果" + result);

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功:serverPort:" + serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("***查询结果" + payment);

        if (payment != null) {
            return new CommonResult(200, "查询成功:serverPort:" + serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录", null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery() {
        // 获取服务
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("***element:" + service);
        }
        // 获取实例
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }
        return this.discoveryClient;
    }


    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }

    @GetMapping("/payment/zipkin")
    public String paymentZipkin() {
        return "hi, this is payment-zipkin fall back(*^_^*)";
    }

}
