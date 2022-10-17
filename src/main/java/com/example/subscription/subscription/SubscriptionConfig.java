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
            ConnectionFactory connectionFactory = new SingleConnectionFactory("ldap://10.14.42.6");
            SearchOperation search = new SearchOperation(connectionFactory, "dc=example,dc=com");
            SearchResponse response = search.execute();
            System.out.println(response);
        };
    }
}
