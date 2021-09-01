package com.zyj.service;

import com.zyj.springCloud.entities.CommonResult;
import com.zyj.springCloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @program: Cloud2020
 * @ClassName PaymentFallbackService
 * @author: YaJun
 * @Date: 2021 - 08 - 23 - 21:24
 * @Package: com.zyj.service
 * @Description:
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444444, "服务降级返回，---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
