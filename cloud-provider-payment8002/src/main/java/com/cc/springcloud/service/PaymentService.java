package com.cc.springcloud.service;

import com.cc.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author : chencheng
 * @Date : 2021/10/15 8:58
 */
public interface PaymentService {
    /**
     * 新增数据
     *
     * @param payment 实例对象
     * @return 实例对象
     */
    public int create(Payment payment);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public Payment getPaymentById(@Param("id") Long id);
}
