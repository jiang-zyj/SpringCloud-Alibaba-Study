package com.zyj.springCloud.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @program: Cloud2020
 * @ClassName Order
 * @author: YaJun
 * @Date: 2021 - 08 - 24 - 11:27
 * @Package: com.zyj.springCloud.bean
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {

    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

    // 订单状态：0：创建中；1：已创建
    private Integer status;

}
