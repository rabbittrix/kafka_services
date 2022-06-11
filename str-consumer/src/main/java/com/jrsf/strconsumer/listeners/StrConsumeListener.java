package com.jrsf.strconsumer.listeners;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumeListener {

    @KafkaListener(groupId = "str-group", topics = "sysfacturing-topic", containerFactory = "strContainerFactory")
    public void listener(String message) {
        log.info("Received message {} ", message);
    }
}
