package com.riying.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Mirai Zhao
 * @create 2021-06-29
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------PaymentFallbackService fall back----paymentInfo_OK---";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------PaymentFallbackService fall back---paymentInfo_TimeOut----";
    }
}
