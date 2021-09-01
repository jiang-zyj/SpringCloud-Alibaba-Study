package com.zyj.service;

import com.zyj.springCloud.entities.CommonResult;
import com.zyj.springCloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: Cloud2020
 * @ClassName PaymentService
 * @author: YaJun
 * @Date: 2021 - 08 - 23 - 21:21
 * @Package: com.zyj.service
 * @Description:
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);

}
