package com.zyj.springCloud.mapper;

import com.zyj.springCloud.bean.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: Cloud2020
 * @ClassName OrderDao
 * @author: YaJun
 * @Date: 2021 - 08 - 24 - 11:29
 * @Package: com.zyj.springCloud.mapper
 * @Description:
 */
public interface OrderDao {

    // 1. 新建订单
    void create(Order order);

    // 2. 修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);

}
