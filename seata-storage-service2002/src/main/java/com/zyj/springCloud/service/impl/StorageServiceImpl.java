package com.zyj.springCloud.service.impl;

import com.zyj.springCloud.mapper.StorageMapper;
import com.zyj.springCloud.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: Cloud2020
 * @ClassName StorageServiceImpl
 * @author: YaJun
 * @Date: 2021 - 08 - 25 - 20:23
 * @Package: com.zyj.springCloud.service.impl
 * @Description:
 */
@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageMapper storageMapper;

    @Override
    public void decrease(Long productID, Integer count) {
        LOGGER.info("----->storage-service中扣减库存开始");
        storageMapper.decrease(productID, count);
        LOGGER.info("----->storage-service中扣减库存结束");
    }
}
