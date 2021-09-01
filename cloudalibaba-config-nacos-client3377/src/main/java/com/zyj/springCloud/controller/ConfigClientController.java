package com.zyj.springCloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Cloud2020
 * @ClassName ConfigClientController
 * @author: YaJun
 * @Date: 2021 - 08 - 16 - 22:29
 * @Package: com.zyj.springCloud.controller
 * @Description:
 */
@RestController
@RefreshScope   // 支持Nacos的动态刷新功能.
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }

}
