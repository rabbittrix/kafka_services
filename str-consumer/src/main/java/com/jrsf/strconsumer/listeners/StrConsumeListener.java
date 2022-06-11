package com.jrsf.strconsumer.listeners;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumeListener {

    @KafkaListener(groupId = "str-group", topics = "sysfacturing-topic", containerFactory = "strContainerFactory")
    public void created(String message) {
        log.info("CREATE ::: Received message {} ", message);
    }@KafkaListener(groupId = "str-group", topics = "sysfacturing-topic", containerFactory = "strContainerFactory")
    public void log(String message) {
        log.info("LOG ::: Received message {} ", message);
    }@KafkaListener(groupId = "str-group-1", topics = "sysfacturing-topic", containerFactory = "strContainerFactory")
    public void history(String message) {
        log.info("HISTORY ::: Received message {} ", message);
    }
}
