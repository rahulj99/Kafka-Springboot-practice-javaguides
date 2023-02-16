package com.example.Springbootkafkapractice.kafka;

import com.example.Springbootkafkapractice.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics="javaguides_json",groupId = "myGroup")
    private void consumeJson(User user){
        LOGGER.info(String.format("message Reveived -> %s", user.toString()));
    }
}

