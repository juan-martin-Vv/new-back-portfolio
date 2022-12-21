package com.jmvv.back.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Configuration
public class configCors {
    @Value("${config.cors.front}")
    private String autorizedEntryPoint;
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins(autorizedEntryPoint)
                        .allowedMethods("GET","POST","UPDATE","DELETE");
                WebMvcConfigurer.super.addCorsMappings(registry);
                log.info("entry point {}",autorizedEntryPoint);   
            }
        };
    }
}
