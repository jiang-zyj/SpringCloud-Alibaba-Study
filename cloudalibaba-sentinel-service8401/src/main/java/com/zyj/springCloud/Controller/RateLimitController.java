package com.zyj.springCloud.Controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zyj.springCloud.BlockHandler.CustomerBlockHandler;
import com.zyj.springCloud.entities.CommonResult;
import com.zyj.springCloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Cloud2020
 * @ClassName RateLimitController
 * @author: YaJun
 * @Date: 2021 - 08 - 23 - 13:38
 * @Package: com.zyj.springCloud.Controller
 * @Description:
 */
@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public CommonResult byResource() {
        return new CommonResult(200, "按资源名称限流测试OK", new Payment(2020L, "serial001"));
    }

    public CommonResult handleException(BlockException exception) {
        return new CommonResult(444, exception.getClass().getCanonicalName() + "\t 服务不可用");
    }

    /**
     * 业务方法与自定义处理方法耦合度太高
     * @return
     */
    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl() {
        return new CommonResult(200, "按Url限流测试OK", new Payment(2020L, "serial002"));
    }

    /**
     * 使用自定义处理方法类
     */
    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
                blockHandlerClass = CustomerBlockHandler.class, // 自定义限流类
                blockHandler = "handlerException2")             // 自定义限流方法
    public CommonResult customerBlockHandler() {
        return new CommonResult(200, "按自定义限流类限流测试OK", new Payment(2020L, "serial003"));
    }

}
