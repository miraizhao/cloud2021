package com.riying.springcloud.service;

import com.riying.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Mirai Zhao
 * @create 2021-06-24
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
