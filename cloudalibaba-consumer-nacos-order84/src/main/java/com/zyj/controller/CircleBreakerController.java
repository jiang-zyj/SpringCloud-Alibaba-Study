package com.zyj.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zyj.service.PaymentService;
import com.zyj.springCloud.entities.CommonResult;
import com.zyj.springCloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: Cloud2020
 * @ClassName CircleBreakerController
 * @author: YaJun
 * @Date: 2021 - 08 - 23 - 17:09
 * @Package: com.zyj.controller
 * @Description:
 */
@RestController
@Slf4j
public class CircleBreakerController {

    public static final String SERVICE_URL = "http://nacos-payment-provider";

//    @Value("${service-url.nacos-user-service}")
//    private String service_url;

    @Resource
    private RestTemplate restTemplate;

    /**
     * 没有配置
     */
    @RequestMapping("/consumer/fallback/{id}")
//    @SentinelResource(value = "fallback")
//    @SentinelResource(value = "fallback", fallback = "handlerFallback")   // fallback只负责业务异常
//    @SentinelResource(value = "fallback", blockHandler = "blockHandler")    // blockHandler只负责sentinel控制台配置违规
//    @SentinelResource(value = "fallback", fallback = "handlerFallback", blockHandler = "blockHandler")  // 两个都配，如果违反了Sentinel配置的流控规则，那么就按流控规则来，也就是说：blockHandler更优先
    @SentinelResource(value = "fallback", fallback = "handlerFallback", blockHandler = "blockHandler", exceptionsToIgnore = {IllegalArgumentException.class})
    public CommonResult<Payment> fallback(@PathVariable Long id) {
        CommonResult result = restTemplate.getForObject(SERVICE_URL + "/paymentSQL/" + id, CommonResult.class, id);

        if (id == 4) {
            throw new IllegalArgumentException("IllegalArgumentException,非法参数异常");
        } else if (result.getData() == null) {
            throw new NullPointerException("NullPointerException,该ID没有对应记录，空指针异常");
        }

        return result;
    }

    // 本例是fallback
    public CommonResult handlerFallback(@PathVariable Long id, Throwable e) {
        Payment payment = new Payment(id, "null");
        return new CommonResult(444, "兜底异常handlerFallback，异常内容为：" + e.getMessage(), payment);
    }

    // 本例是blockHandler
    public CommonResult blockHandler(@PathVariable Long id, BlockException blockException) {
        Payment payment = new Payment(id, "null");
        return new CommonResult(445, "blockHandler-sentinel限流，无此流水：blockException：" + blockException.getMessage(), payment);
    }


    //================== OpenFeign
    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/openFeign/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        return paymentService.paymentSQL(id);
    }

}
