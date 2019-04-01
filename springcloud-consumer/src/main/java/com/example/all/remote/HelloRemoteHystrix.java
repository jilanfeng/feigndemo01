package com.example.all.remote;

import com.example.all.SpringcloudConsumerApplication;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: liuweif
 * @Date: 2019/3/29 11:29
 * @version: v
 */

/**
 * 两种方式：加上@slf4j可以省略注释的那行代码，不加注解就得定义日志
 *
 */
@Slf4j
@Component
public class HelloRemoteHystrix implements IHelloRemote{

//    private static final Logger logger = LoggerFactory.getLogger(SpringcloudConsumerApplication.class);
    @Override
    public String hello(@RequestParam("name") String name){

        log.error("this message failed");
        return "the "+name+",this message failed!";
    }
}
