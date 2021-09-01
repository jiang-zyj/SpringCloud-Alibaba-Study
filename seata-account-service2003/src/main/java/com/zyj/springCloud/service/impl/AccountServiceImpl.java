package com.zyj.springCloud.service.impl;

import com.zyj.springCloud.mapper.AccountMapper;
import com.zyj.springCloud.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @program: Cloud2020
 * @ClassName AccountServiceImpl
 * @author: YaJun
 * @Date: 2021 - 08 - 25 - 20:43
 * @Package: com.zyj.springCloud.service.impl
 * @Description:
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    private AccountMapper accountMapper;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("----->账户余额扣减开始");
        // 模拟超时异常，全局事务回滚。因为Feign默认1s，超过1s之后会报错
        // 睡眠几秒
//        try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { e.printStackTrace(); }
        accountMapper.decrease(userId, money);
        LOGGER.info("----->账户余额扣减结束");
    }
}
