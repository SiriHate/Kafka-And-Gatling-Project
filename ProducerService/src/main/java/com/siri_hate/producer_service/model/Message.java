package com.siri_hate.producer_service.model;

import org.springframework.stereotype.Component;

@Component
public class Message {

    private String message;

    public Message() { }

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessageText(String message) {
        this.message = message;
    }

}
