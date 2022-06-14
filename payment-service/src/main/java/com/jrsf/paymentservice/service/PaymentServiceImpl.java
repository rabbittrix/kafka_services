package com.jrsf.paymentservice.service;

import com.jrsf.paymentservice.model.Payment;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void sendPayment(Payment payment) {
        log.info("Sending payment: {}", payment);

    }

}
