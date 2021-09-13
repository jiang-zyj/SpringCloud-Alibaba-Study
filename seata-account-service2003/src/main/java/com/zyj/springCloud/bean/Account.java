package com.zyj.springCloud.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @program: Cloud2020
 * @ClassName Account
 * @author: YaJun
 * @Date: 2021 - 09 - 12 - 21:32
 * @Package: com.zyj.springCloud.bean
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account {

    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 总额度
     */
    private BigDecimal total;

    /**
     * 已用额度
     */
    private BigDecimal used;

    /**
     * 剩余额度
     */
    private BigDecimal residue;

}
