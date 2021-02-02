package com.huutran.financetrawcker.core.resource;

import com.huutran.financetrawcker.core.note.datamodel.TransactionData;
import com.huutran.financetrawcker.core.resource.state.base.AccountState;
import com.huutran.financetrawcker.core.transaction.Transaction;

import java.math.BigDecimal;

public class AccountResource extends BaseFinanceResource {

    private MoneyResource relatedResource;
    private AccountState accountState;

    public AccountResource(BigDecimal totalAmount) {
        super(totalAmount);
    }

    public AccountResource(BigDecimal totalAmount, MoneyResource relatedResource) {
        super(BigDecimal.ZERO);
        this.relatedResource = relatedResource;
        this.relatedResource.depositTo(this, totalAmount);
    }

    public AccountResource(BigDecimal totalAmount, String name, MoneyResource relatedResource) {
        super(totalAmount, name);
        this.relatedResource = relatedResource;
    }

    public void open(MoneyResource fromResource, BigDecimal withAmount) {
        accountState.onOpen(withAmount, fromResource);
    }

    public void close() {
        this.accountState.onClose();
    }

    public MoneyResource getRelatedResource() {
        return this.relatedResource;
    }

    void changeState(AccountState state) {
        this.accountState = state;
    }


//    public Transaction newTransaction(TransactionData.TransactionType type, BigDecimal amount, String reason) {
//        return TransactionData.withinSelf(type, this, amount, reason);
//    }


}
