package com.zyj.springCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @program: SpringCloud
 * @ClassName CommonResult
 * @author: YaJun
 * @Date: 2021 - 07 - 28 - 22:35
 * @Package: com.zyj.springCloud.entities
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

}
