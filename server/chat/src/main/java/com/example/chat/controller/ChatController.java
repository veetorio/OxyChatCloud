package com.example.chat.controller;

import jakarta.websocket.OnError;
import jakarta.websocket.OnMessage;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chat.model.Msg;

@RestController
public class ChatController {

    @GetMapping("get")
    public String string(){
        return "ola mundo";
    }

    @MessageMapping("/channelOne")
    @SendTo("/chat")
    public Msg sendMessage(Msg message){
        return message;
    }




}
