package com.example.all.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController，被调用
 *
 * @Author: liuweif
 * @Date: 2019/3/29 12:21
 * @version: v
 */

/**
 *
 * 通过sleep延时5秒，触发服务降级
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name) throws InterruptedException {
       Thread.sleep(5000L);
        return "hello "+name+",this is first message";
    }
}
