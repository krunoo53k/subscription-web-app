package com.example.subscription.subscription;

import org.ldaptive.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SubscriptionConfig {
    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("Starting...");
        };
    }
}
