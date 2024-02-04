package com.example.chat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

import com.example.chat.model.Msg;

@RestController
public class ChatController {
    @MessageMapping("/channelOne")
    @SendTo("/connectServer")
    public Msg sendMessage(Msg message){
        return message;
    }
}
