package com.zyj.springCloud.mapper;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @program: Cloud2020
 * @ClassName AccountMapper
 * @author: YaJun
 * @Date: 2021 - 08 - 25 - 20:37
 * @Package: com.zyj.springCloud.mapper
 * @Description:
 */
public interface AccountMapper {

    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
