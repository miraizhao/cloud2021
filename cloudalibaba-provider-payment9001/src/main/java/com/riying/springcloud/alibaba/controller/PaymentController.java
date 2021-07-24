package com.riying.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mirai Zhao
 * @create: 2021-07-14  09:50
 * @Description:
 */
@RestController
public class PaymentController {


    @Value("${server.port}")
    private String serverport;

    @Autowired
    private NacosConf conf;

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        return "nacos register，serverport："+serverport+"\t id:"+id + conf.getStr();
    }
}
