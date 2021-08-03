package com.zyj.springCloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: Cloud2020
 * @ClassName OrderZkController
 * @author: YaJun
 * @Date: 2021 - 08 - 02 - 20:38
 * @Package: com.zyj.springCloud.controller
 * @Description:
 */
@RestController
@Slf4j
public class OrderZkController {

    public static final String INVOKE_URL = "http://cloud-providerZookeeper-payment";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/payment/zk")
    public String paymentInfo() {
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
        return result;
    }

}
