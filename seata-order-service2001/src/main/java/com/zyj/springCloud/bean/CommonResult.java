package com.zyj.springCloud.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @program: Cloud2020
 * @ClassName CommonResult
 * @author: YaJun
 * @Date: 2021 - 08 - 24 - 11:25
 * @Package: com.zyj.springCloud.bean
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

    public CommonResult(Integer code,  String message) {
        this(code,message,null);
    }
}
