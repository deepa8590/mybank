package com.bank;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

//Creating an Transaction class to represent a bank transaction with attributes such as Id, amount, timestamp, and reference. The class includes constructors, getters, and setters for each attribute.
public class Transaction {
    private String Id;
    private BigDecimal amount;
    private LocalDateTime timestamp;
    private String Reference;
    
    public Transaction(){

    }
    public Transaction(BigDecimal amount, LocalDateTime timestamp, String Reference) {
        this.Id = UUID.randomUUID().toString();
        this.amount = amount;
        this.timestamp = timestamp;
        this.Reference = Reference;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
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
        return Reference;
    }

    public void setReference(String Reference) {
        this.Reference = Reference;
    }
}