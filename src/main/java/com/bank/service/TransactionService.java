package com.bank.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.bank.model.Transaction;

@Component 
public class TransactionService{
 
    private final String bankSlogan;

    //Constructor injection to get the bank slogan from application.properties
    public TransactionService(@Value("${bank.slogan}")  String bankSlogan) {
        this.bankSlogan = bankSlogan;
    }

    List<Transaction> transactions = new CopyOnWriteArrayList();


    public List<Transaction> findAll(){
        return transactions;
    }
    public Transaction create(BigDecimal amount, String reference){
        LocalDateTime timestamp = LocalDateTime.now();
        Transaction transaction = new Transaction(amount, timestamp, reference, bankSlogan);
        transactions.add(transaction);
        return transaction;

    }
}