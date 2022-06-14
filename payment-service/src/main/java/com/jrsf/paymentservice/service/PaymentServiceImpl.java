package com.jrsf.paymentservice.service;

import com.jrsf.paymentservice.model.Payment;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@RequiredArgsConstructor
@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    @SneakyThrows
    @Override
    public void sendPayment(Payment payment) {
        log.info("Sending payment: {}", payment);
        Thread.sleep(1000);

        log.info("Payment sent....");
        kafkaTemplate.send("payment-topic", payment);

    }

}
