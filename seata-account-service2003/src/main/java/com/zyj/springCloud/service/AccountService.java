package com.zyj.springCloud.service;

import java.math.BigDecimal;

/**
 * @program: Cloud2020
 * @ClassName AccountService
 * @author: YaJun
 * @Date: 2021 - 08 - 25 - 20:43
 * @Package: com.zyj.springCloud.service
 * @Description:
 */
public interface AccountService {
    /**
     * 修改账户余额
     */
    void decrease(Long userId, BigDecimal money);

}
