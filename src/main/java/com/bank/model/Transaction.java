package com.bank.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;


//Creating an Transaction class to represent a bank transaction with attributes such as Id, amount, timestamp, and reference. The class includes constructors, getters, and setters for each attribute.
public class Transaction {
    private String id;
    private BigDecimal amount;
    private LocalDateTime timestamp;
    private String slogan;

    private String reference;
    
    public Transaction(){

    }
    public Transaction(BigDecimal amount, LocalDateTime timestamp, String reference ,String slogan) {
        this.id = UUID.randomUUID().toString();
        this.amount = amount;
        this.timestamp = timestamp;
        this.reference = reference;
        this.slogan = slogan;
    }

    public String getId() {
        return id;
    }

    public void setId(String Id) {
        this.id = Id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
    public String getSlogan() {
        return slogan;
    }
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
}