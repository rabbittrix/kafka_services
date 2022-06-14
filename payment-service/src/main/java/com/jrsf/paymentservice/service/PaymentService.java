package com.jrsf.paymentservice.service;

import com.jrsf.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
