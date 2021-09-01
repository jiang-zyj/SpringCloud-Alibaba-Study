package com.zyj.springCloud.BlockHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zyj.springCloud.entities.CommonResult;

/**
 * @program: Cloud2020
 * @ClassName CustomerBlockHandler
 * @author: YaJun
 * @Date: 2021 - 08 - 23 - 15:11
 * @Package: com.zyj.springCloud.BlockHandler
 * @Description:
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(444, "按客户自定义，Global HandlerException...1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(444, "按客户自定义，Global HandlerException...2");
    }

}
