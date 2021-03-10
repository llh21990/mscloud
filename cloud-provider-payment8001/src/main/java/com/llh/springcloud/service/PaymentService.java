package com.llh.springcloud.service;

import com.llh.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    int create(Payment payment);

    Payment getById(Long id);

}
