package com.bank.context;

import com.bank.service.TransactionService;
import tools.jackson.databind.ObjectMapper;

public class Application {
    public static final TransactionService transactionService = new TransactionService();
    public static final objectMapper objectMapper = new ObjectMapper();
    
}
