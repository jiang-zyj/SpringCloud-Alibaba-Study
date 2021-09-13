package com.zyj.springCloud.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @program: Cloud2020
 * @ClassName Storage
 * @author: YaJun
 * @Date: 2021 - 09 - 12 - 21:14
 * @Package: com.zyj.springCloud.bean
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;

}
