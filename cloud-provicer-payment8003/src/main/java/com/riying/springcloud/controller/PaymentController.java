package com.riying.springcloud.controller;

import com.riying.springcloud.entity.CommonResult;
import com.riying.springcloud.entity.Payment;
import com.riying.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Mirai Zhao
 * @create 2021-06-24
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverport;

    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create (@RequestBody Payment payment){
        int result=paymentService.create(payment);
        if (result>0){
            return new CommonResult(200,"插入数据成功,serverport: "+serverport,result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById (@PathVariable("id") Long id){
        Payment payment=paymentService.getPaymentById(id);
        if (payment!=null){
            return new CommonResult(200,"查询成功,serverport: "+serverport,payment);
        }else {
            return new CommonResult(444,"没有对应结果记录，查询ID："+id,null);
        }
    }
}
