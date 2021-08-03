package com.zyj.springCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @program: SpringCloud
 * @ClassName Payment
 * @author: YaJun
 * @Date: 2021 - 07 - 28 - 22:33
 * @Package: com.zyj.springCloud.entities
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Payment {

    private Long id;

    private String serial;

}
