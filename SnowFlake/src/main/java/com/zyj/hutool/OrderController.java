package com.zyj.hutool;

import com.zyj.hutool.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Cloud2020
 * @ClassName OrderController
 * @author: YaJun
 * @Date: 2021 - 09 - 13 - 20:41
 * @Package: com.zyj.hutool
 * @Description:
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/snowflake")
    public String index() {
        return orderService.getIDBySnowFlake();
    }
}
