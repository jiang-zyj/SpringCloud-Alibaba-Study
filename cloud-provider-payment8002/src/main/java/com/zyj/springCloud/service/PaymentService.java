package com.zyj.springCloud.service;

import com.zyj.springCloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: SpringCloud
 * @ClassName PaymentService
 * @author: YaJun
 * @Date: 2021 - 07 - 28 - 22:59
 * @Package: com.zyj.springCloud.service
 * @Description:
 */

public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
