package com.siri_hate.producer_service.controller;

import com.siri_hate.producer_service.model.Message;
import com.siri_hate.producer_service.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    private final ApplicationService applicationService;

    @Autowired
    ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping("/message")
    public void sendMessage(@RequestBody Message message) {
        applicationService.sendMessage(message.getMessage());
    }

}
