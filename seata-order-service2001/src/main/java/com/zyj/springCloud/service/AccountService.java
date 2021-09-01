package com.zyj.springCloud.service;

import com.zyj.springCloud.bean.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @program: Cloud2020
 * @ClassName AccountService
 * @author: YaJun
 * @Date: 2021 - 08 - 24 - 11:41
 * @Package: com.zyj.springCloud.service
 * @Description:
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money);

}
