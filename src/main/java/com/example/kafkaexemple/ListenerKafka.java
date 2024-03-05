package com.example.kafkaexemple;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerKafka {


    @KafkaListener(
            topics = "maro",
            groupId = "groupId"
    )
    public void listener(String data)
    {
        System.out.println("Listener data received : " + data);
    }
}
