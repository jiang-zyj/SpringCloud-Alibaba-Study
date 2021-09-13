package com.zyj.hutool.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.IdUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @program: Cloud2020
 * @ClassName IdGeneratorSnowflake
 * @author: YaJun
 * @Date: 2021 - 09 - 13 - 20:47
 * @Package: com.zyj.hutool.utils
 * @Description:
 */
@Slf4j
@Component
public class IdGeneratorSnowflake {

    /**
     * 当前机器的workerId 范围 [0-31]
     */
    private long workerId = 0;

    /**
     * 数据中心ID 范围 [0-31]
     */
    private long datacenterId = 1;

    /**
     * hutool生成雪花算法ID
     */
    private Snowflake snowflake = IdUtil.createSnowflake(workerId, datacenterId);

    @PostConstruct
    public void init() {
        try {
            workerId = NetUtil.ipv4ToLong(NetUtil.getLocalhostStr());
            log.info("当前机器的workerId:{}", workerId);
        } catch (Exception e) {
            e.printStackTrace();
            log.warn("当前机器的workerId获取失败", e);
            workerId = NetUtil.getLocalhostStr().hashCode();
        }
    }

    public synchronized long snowflakeId() {
        return snowflake.nextId();
    }

    /**
     * 重构
     * @param workerId
     * @param datacenterId
     * @return
     */
    public synchronized long snowflakeId(long workerId, long datacenterId) {
        Snowflake snowflake = IdUtil.createSnowflake(workerId, datacenterId);
        return snowflake.nextId();
    }

    public static void main(String[] args) {
        System.out.println(new IdGeneratorSnowflake().snowflakeId());
    }

}
