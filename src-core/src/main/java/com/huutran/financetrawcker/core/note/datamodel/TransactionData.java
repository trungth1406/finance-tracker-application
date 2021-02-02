package com.huutran.financetrawcker.core.note.datamodel;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TransactionData extends BaseData {

    private final LocalDate dateOfExecution;
    private final BigDecimal transactionAmount;
    private final String description;
    private TransactionType type;


    public TransactionData(Integer id, String title, LocalDate dateOfExecution,
                           BigDecimal transactionAmount, String description, TransactionType type) {
        super(id, title);
        this.dateOfExecution = dateOfExecution;
        this.transactionAmount = transactionAmount;
        this.description = description;
        this.type = type;
    }

    public String getDescription() {
        return this.description;
    }

    public LocalDate getDateOfExecution() {
        return dateOfExecution;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public interface TransactionType {

        String getName();

    }

    private static class Withdraw implements TransactionType {

        @Override
        public String getName() {
            return "WITHDRAW";
        }
    }

    private static class Deposit implements TransactionType {


        @Override
        public String getName() {
            return "DEPOSIT";
        }
    }
}
