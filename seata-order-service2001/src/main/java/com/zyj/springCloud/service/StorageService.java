package com.zyj.springCloud.service;

import com.zyj.springCloud.bean.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: Cloud2020
 * @ClassName StorageService
 * @author: YaJun
 * @Date: 2021 - 08 - 24 - 11:39
 * @Package: com.zyj.springCloud.service
 * @Description:
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productID, @RequestParam("count") Integer count);

}
