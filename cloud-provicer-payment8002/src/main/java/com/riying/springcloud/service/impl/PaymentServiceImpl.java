package com.riying.springcloud.service.impl;

import com.riying.springcloud.dao.PaymentDao;
import com.riying.springcloud.entity.Payment;
import com.riying.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Mirai Zhao
 * @create 2021-06-24
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
