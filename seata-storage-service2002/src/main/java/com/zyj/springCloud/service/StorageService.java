package com.zyj.springCloud.service;

/**
 * @program: Cloud2020
 * @ClassName StorageService
 * @author: YaJun
 * @Date: 2021 - 08 - 25 - 20:23
 * @Package: com.zyj.springCloud.service
 * @Description:
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productID, Integer count);

}
