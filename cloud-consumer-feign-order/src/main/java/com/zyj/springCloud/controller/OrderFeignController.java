package com.zyj.springCloud.controller;

import com.zyj.springCloud.entities.CommonResult;
import com.zyj.springCloud.entities.Payment;
import com.zyj.springCloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Cloud2020
 * @ClassName OrderFeignController
 * @author: YaJun
 * @Date: 2021 - 08 - 03 - 11:20
 * @Package: com.zyj.springCloud.controller
 * @Description:
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        log.info(paymentFeignService.getPaymentById(id).toString());
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        // openfeign-ribbon，客户端一般默认等待一秒钟
        return paymentFeignService.paymentFeignTimeout();
    }

}
