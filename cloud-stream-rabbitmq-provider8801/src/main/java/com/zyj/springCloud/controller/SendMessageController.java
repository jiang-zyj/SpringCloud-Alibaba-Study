package com.zyj.springCloud.controller;

import com.zyj.springCloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: Cloud2020
 * @ClassName SendMessageController
 * @author: YaJun
 * @Date: 2021 - 08 - 09 - 21:40
 * @Package: com.zyj.springCloud.controller
 * @Description:
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider iMessageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return iMessageProvider.send();
    }

}
