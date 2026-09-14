package com.bank.context;

import com.bank.BankApplicationLauncher;
import com.bank.service.TransactionService;

import tools.jackson.databind.ObjectMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = BankApplicationLauncher.class)
public class BankApplicationConfiguration {
    // This class can be used to configure beans and other application settings
    // @Bean
    // public TransactionService transactionService(){
    //     return new TransactionService();
    // }

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
}