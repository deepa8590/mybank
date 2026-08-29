package com.bank.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.bank.model.Transaction;

public class TransactionService{
 
    List<Transaction> transactions = new CopyOnWriteArrayList<>();

    public List<Transaction> findAll(){
        return transactions;
    }
    public Transaction create(BigDecimal amount, String reference){
        LocalDateTime timestamp = LocalDateTime.now();
        Transaction transaction =new Transaction(amount, timestamp, reference);
        transactions.add(transaction);
        return transaction;

    }
}