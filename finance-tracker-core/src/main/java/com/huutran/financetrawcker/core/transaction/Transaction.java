package com.huutran.financetrawcker.core.transaction;

import com.huutran.financetrawcker.core.resource.AccountResource;
import com.huutran.financetrawcker.core.resource.BaseFinanceResource;
import com.huutran.financetrawcker.core.resource.FinanceResource;
import lombok.With;
import org.springframework.transaction.interceptor.TransactionInterceptor;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {

    private final LocalDate dateOfExecution;
    private final BigDecimal transactionAmount;
    private final String description;

    private Transaction(LocalDate dateOfExecution, BigDecimal transactionAmount, String description) {
        this.dateOfExecution = dateOfExecution;
        this.transactionAmount = transactionAmount;
        this.description = description;
    }


    public static Transaction withinSelf(TransactionType type, FinanceResource accountResource, BigDecimal amount, String reason) {
        accountResource.withDraw(amount);
        String description = String.format("%s  %d %s was made from %s ", type.getName(), reason, accountResource.getClass().getSimpleName());
        return new Transaction(LocalDate.now(), amount, description);
    }

    public static Transaction transfer(FinanceResource from, FinanceResource to, BigDecimal amount) {
        from.depositTo(to, amount);
        String description = String.format("%s  transfered to  %s with amount %d ", ((BaseFinanceResource) from).getName(),
                ((BaseFinanceResource) to).getName(), amount);
        return new Transaction(LocalDate.now(), amount, description);
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
