package com.zyj.springCloud.service.impl;

import com.zyj.springCloud.dao.PaymentDao;
import com.zyj.springCloud.entities.Payment;
import com.zyj.springCloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @program: SpringCloud
 * @ClassName PaymentServiceImpl
 * @author: YaJun
 * @Date: 2021 - 07 - 28 - 23:00
 * @Package: com.zyj.springCloud.service.impl
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

}
