package com.zyj.springCloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Cloud2020
 * @ClassName ConfigClientController
 * @author: YaJun
 * @Date: 2021 - 08 - 08 - 21:35
 * @Package: com.zyj.springCloud.controller
 * @Description:
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${server.port}")
    private String  serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return "serverPort: " + serverPort + "\t\n\n configInfo: " + configInfo;
    }

}
