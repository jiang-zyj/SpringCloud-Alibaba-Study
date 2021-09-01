package com.zyj.springCloud.controller;

import com.zyj.springCloud.bean.CommonResult;
import com.zyj.springCloud.bean.Order;
import com.zyj.springCloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: Cloud2020
 * @ClassName OrderController
 * @author: YaJun
 * @Date: 2021 - 08 - 24 - 11:51
 * @Package: com.zyj.springCloud.controller
 * @Description:
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    private CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }

}
