package com.zyj.springCloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Cloud2020
 * @ClassName ConfigClientController
 * @author: YaJun
 * @Date: 2021 - 08 - 08 - 12:51
 * @Package: com.zyj.springCloud.controller
 * @Description:
 */
@RestController
@RefreshScope
public class ConfigClientController {

    /**
     * config.info是github上配置文件中的，如果成功读取到，则证明配置成功
     */
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }

}
