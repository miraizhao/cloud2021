package com.riying.sringcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Mirai Zhao
 * @create 2021-06-28
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String  serverPort;
    @RequestMapping("/payment/a")
    public String Payment(){
        return "springcloud with consul:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
