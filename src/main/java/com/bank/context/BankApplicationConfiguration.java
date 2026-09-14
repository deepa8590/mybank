package com.bank.context;

import com.bank.BankApplicationLauncher;
import com.bank.service.TransactionService;

import tools.jackson.databind.ObjectMapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackageClasses = BankApplicationLauncher.class)
@PropertySource ("classpath:application.properties")
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