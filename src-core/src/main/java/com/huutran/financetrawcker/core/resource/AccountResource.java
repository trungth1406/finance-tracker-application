package com.huutran.financetrawcker.core.resource;

import com.huutran.financetrawcker.core.transaction.Transaction;

import java.math.BigDecimal;

public class AccountResource extends BaseFinanceResource {

    private FinanceResource relatedResource;

    public AccountResource(BigDecimal totalAmount) {
        super(totalAmount);
    }

    public AccountResource(BigDecimal totalAmount, FinanceResource relatedResource) {
        super(BigDecimal.ZERO);
        this.relatedResource = relatedResource;
        this.relatedResource.depositTo(this, totalAmount);
    }

    public AccountResource(BigDecimal totalAmount, String name, FinanceResource relatedResource) {
        super(totalAmount, name);
        this.relatedResource = relatedResource;
    }


    public void close() {
        this.relatedResource.withdrawFrom(this, this.totalAmount);
    }

    public Transaction newTransaction(Transaction.TransactionType type, BigDecimal amount, String reason) {
        return Transaction.withinSelf(type, this, amount, reason);
    }


}
