package com.jrsf.strconsumer.listeners;

import com.jrsf.strconsumer.custom.StrConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumeListener {

    @StrConsumerCustomListener(groupId = "str-group")
    public void created(String message) {
        log.info("CREATE ::: Received message {} ", message);
    }
    @StrConsumerCustomListener(groupId = "str-group")
    public void log(String message) {
        log.info("LOG ::: Received message {} ", message);
    }

    //Using interceptor in business rule
    @KafkaListener(groupId = "str-group-1", topics = "sysfacturing-topic", containerFactory = "validMessageContainerFactory")
    public void history(String message) {
        log.info("HISTORY ::: Received message {} ", message);
    }
}
