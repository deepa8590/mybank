package com.bank;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionService{
    public Transaction create(BigDecimal amount, String reference){
        LocalDateTime timestamp = LocalDateTime.now();
        return new Transaction(amount, timestamp, reference);

    }
}