package com.example.all.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 远程调用
 *
 * @Author: liuweif
 * @Date: 2019/3/29 11:30
 * @version: v
 */
@FeignClient(value = "springcloud-producer",fallback = HelloRemoteHystrix.class)

public interface IHelloRemote {
   @RequestMapping("/hello")
   String hello(@RequestParam(value = "name") String name);

}
