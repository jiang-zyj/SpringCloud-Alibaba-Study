package com.zyj.springCloud.Controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @program: Cloud2020
 * @ClassName FlowLimitController
 * @author: YaJun
 * @Date: 2021 - 08 - 19 - 20:47
 * @Package: com.zyj.springCloud.Controller
 * @Description: 流控管理
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        // 演示线程数
//        try { TimeUnit.MILLISECONDS.sleep(800); } catch (InterruptedException e) { e.printStackTrace(); }
        return "-------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + "\t" + "...testB");
        return "-------testB";
    }

    @GetMapping("/testD")
    public String testD() {
        // 暂停几秒钟线程
//        try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
//        log.info("testD 测试RT");

        log.info("testD 异常比例");
        int age = 10 / 0;
        return "------testD";
    }

    @GetMapping("/testE")
    public String testE() {
        log.info("testE 测试异常数");
        int age = 10 / 0;
        return "-------test E";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                         @RequestParam(value = "p2", required = false) String p2) {
        int age = 10 / 0;
        return "------testHotKey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException e) {
        // sentinel系统默认的提示为：Blocked by Sentinel (flow limiting)
        
        return "------deal_testHotKey失败,o(╥﹏╥)o\n" + e.getMessage();
    }


}
