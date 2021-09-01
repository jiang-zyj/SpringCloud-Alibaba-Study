package com.zyj.springCloud.controller;

import com.zyj.springCloud.bean.CommonResult;
import com.zyj.springCloud.service.StorageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: Cloud2020
 * @ClassName StorageController
 * @author: YaJun
 * @Date: 2021 - 08 - 25 - 20:22
 * @Package: com.zyj.springCloud.controller
 * @Description:
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @PostMapping(value = "/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200, "修改库存成功");
    }

}
