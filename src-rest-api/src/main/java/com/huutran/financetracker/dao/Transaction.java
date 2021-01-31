package com.huutran.financetracker.dao;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(schema = "FINANCETRACKER", name = "TRANSACTION")
public class Transaction {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "DATE_OF_EXECUTION")
    private LocalDate dateOfExecution;

    @Column(name = "FK_RESOURCE")
    private Long fkResource;

    @Column(name = "FK_ACCOUNT")
    private Long fkAccount;

    @Column(name = "TRANSACTION_TYPE")
    private String transactionType;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDate getDateOfExecution() {
        return this.dateOfExecution;
    }

    public void setDateOfExecution(LocalDate dateOfExecution) {
        this.dateOfExecution = dateOfExecution;
    }

    public Long getFkResource() {
        return this.fkResource;
    }

    public void setFkResource(Long fkResource) {
        this.fkResource = fkResource;
    }

    public Long getFkAccount() {
        return this.fkAccount;
    }

    public void setFkAccount(Long fkAccount) {
        this.fkAccount = fkAccount;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
