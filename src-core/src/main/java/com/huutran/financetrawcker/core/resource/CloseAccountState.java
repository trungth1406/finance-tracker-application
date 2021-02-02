package com.huutran.financetrawcker.core.resource;

import com.huutran.financetrawcker.core.resource.state.base.AccountState;

import java.math.BigDecimal;

public class CloseAccountState implements AccountState {

    private final AccountResource accountResource;

    public CloseAccountState(AccountResource accountResource) {
        this.accountResource = accountResource;
    }

    @Override
    public void onOpen(BigDecimal amount, MoneyResource fromResource) {
        this.accountResource.withdrawFrom(fromResource, amount);
    }

    @Override
    public void onClose() {

    }
}
