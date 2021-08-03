package com.zyj.springCloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: Cloud2020
 * @ClassName PaymentController
 * @author: YaJun
 * @Date: 2021 - 08 - 02 - 9:52
 * @Package: com.zyj.springCloud.com.zyj.springCloud.controller
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "payment/consul")
    public String paymentConsul() {
        return "SpringCloud with consul:" + serverPort + "\t" + UUID.randomUUID();
    }

}
