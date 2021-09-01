package com.zyj.springCloud.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @program: Cloud2020
 * @ClassName StorageMapper
 * @author: YaJun
 * @Date: 2021 - 08 - 25 - 20:24
 * @Package: com.zyj.springCloud.mapper
 * @Description:
 */
public interface StorageMapper {

    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
