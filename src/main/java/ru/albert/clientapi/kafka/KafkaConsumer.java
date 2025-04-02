package ru.albert.clientapi.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "book", groupId = "myConsumer")
    public void listen(String message) {
        System.out.println("Message" + message);
    }
}
