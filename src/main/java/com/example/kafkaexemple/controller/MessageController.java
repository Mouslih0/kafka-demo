package com.example.kafkaexemple.controller;

import com.example.kafkaexemple.dto.MessageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/message")
@RequiredArgsConstructor
public class MessageController {

    private final KafkaTemplate<String, String> kafkaTemplate;


    @PostMapping
    public void message(@RequestBody MessageDto messageDto)
    {
        kafkaTemplate.send("maro", messageDto.getMessage());
    }
}
