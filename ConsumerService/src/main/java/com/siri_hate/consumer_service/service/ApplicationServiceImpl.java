package com.siri_hate.consumer_service.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Override
    @KafkaListener(topics = "main_topic", groupId = "consumers")
    public void getMessage(String message) {
        System.out.println("Received Message is: " + message);
    }

}
