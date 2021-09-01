package com.zyj.springCloud.controller;

import com.zyj.springCloud.bean.CommonResult;
import com.zyj.springCloud.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @program: Cloud2020
 * @ClassName AccountController
 * @author: YaJun
 * @Date: 2021 - 08 - 25 - 20:36
 * @Package: com.zyj.springCloud.controller
 * @Description:
 */
@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @PostMapping(value = "/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        accountService.decrease(userId, money);
        return new CommonResult(200, "账户余额修改成功");
    }

}
