package com.example.chat.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class Sockt implements WebSocketMessageBrokerConfigurer{
    final static String path = "/connectServer";

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registryMessage){
        registryMessage
            .enableSimpleBroker(path);
        registryMessage
            .setApplicationDestinationPrefixes("/message");
    } 
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry){
        registry
            .addEndpoint(path);
        registry
            .addEndpoint(path).withSockJS();
    }


    
}
