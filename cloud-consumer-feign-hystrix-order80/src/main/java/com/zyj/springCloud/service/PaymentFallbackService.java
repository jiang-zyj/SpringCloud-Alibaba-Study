package com.zyj.springCloud.service;

import org.springframework.stereotype.Component;

/**
 * @program: Cloud2020
 * @ClassName PaymentFallbackService
 * @author: YaJun
 * @Date: 2021 - 08 - 05 - 21:07
 * @Package: com.zyj.springCloud.service
 * @Description:
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------PaymentFallbackService fallback  paymentInfo_OK/(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "-----PaymentFallbackService fall back paymentInfo_Timeout/(ㄒoㄒ)/~~";
    }
}
