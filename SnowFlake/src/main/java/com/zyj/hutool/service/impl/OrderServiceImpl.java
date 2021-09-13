package com.zyj.hutool.service.impl;

import com.zyj.hutool.service.OrderService;
import com.zyj.hutool.utils.IdGeneratorSnowflake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: Cloud2020
 * @ClassName OrderServiceImpl
 * @author: YaJun
 * @Date: 2021 - 09 - 13 - 20:45
 * @Package: com.zyj.hutool.service.impl
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private IdGeneratorSnowflake idGenerator;

    @Override
    public String getIDBySnowFlake() {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 20; i++) {
            threadPool.submit(() -> {
                System.out.println(idGenerator.snowflakeId());
            });
        }
        threadPool.shutdown();
        return "hello snowflake";
    }
}
