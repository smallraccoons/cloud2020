package com.cc.springcloud.service.impl;

import com.cc.springcloud.dao.PaymentDao;
import com.cc.springcloud.entities.Payment;
import com.cc.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : chencheng
 * @Date : 2021/10/15 8:59
 */
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
