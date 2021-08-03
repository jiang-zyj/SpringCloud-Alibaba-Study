package com.zyj.springCloud.dao;

import com.zyj.springCloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: SpringCloud
 * @ClassName PaymentDao
 * @author: YaJun
 * @Date: 2021 - 07 - 28 - 22:38
 * @Package: com.zyj.springCloud.dao
 * @Description:
 */
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
