package com.zyj.springCloud.service;

import com.zyj.springCloud.entities.CommonResult;
import com.zyj.springCloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: Cloud2020
 * @ClassName PaymentFeignService
 * @author: YaJun
 * @Date: 2021 - 08 - 03 - 11:15
 * @Package: com.zyj.springCloud.service
 * @Description:
 */
@Component
// 使用 Feign
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout();
}
