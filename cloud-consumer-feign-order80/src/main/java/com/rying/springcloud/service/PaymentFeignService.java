package com.rying.springcloud.service;

import com.riying.springcloud.entity.CommonResult;
import com.riying.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Mirai Zhao
 * @create 2021-06-28
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
     @GetMapping(value = "/payment/get/{id}")
     CommonResult<Payment> getPaymentById (@PathVariable("id") Long id);

     @GetMapping(value = "/payment/feign/timeout")
     public String paymentFeignTimeout() throws InterruptedException;

     }
