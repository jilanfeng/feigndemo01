package com.example.all.controller;

import com.example.all.remote.IHelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 调用接口
 *
 * @Author: liuweif
 * @Date: 2019/3/29 12:25
 * @version: v
 */
@RestController
public class ConsumerController {
    @Autowired
    IHelloRemote iHelloRemote;
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return iHelloRemote.hello(name);
    }

}