package com.bank.context;

import com.bank.service.TransactionService;

import tools.jackson.databind.ObjectMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankApplicationConfiguration {
    // This class can be used to configure beans and other application settings
    @Bean
    public TransactionService transactionService(){
        return new TransactionService();
    }

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
}