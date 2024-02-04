package com.example.chat.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CORS implements WebMvcConfigurer{
    public void ConfigurationCors(CorsRegistry cors){
        cors
        .addMapping("/**")
        .allowedOrigins("*");
    }
    
}
