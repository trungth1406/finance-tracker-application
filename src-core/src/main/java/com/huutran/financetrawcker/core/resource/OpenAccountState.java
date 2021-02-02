package com.huutran.financetrawcker.core.resource;

import com.huutran.financetrawcker.core.resource.state.base.AccountState;

import java.math.BigDecimal;

public class OpenAccountState implements AccountState {

    private AccountResource accountResource;

    public OpenAccountState(AccountResource baseFinanceResource) {
        this.accountResource = baseFinanceResource;
    }

    @Override
    public void onOpen(BigDecimal amount, MoneyResource fromResource) {
    }

    @Override
    public void onClose() {
        this.accountResource.getRelatedResource()
                .withdrawFrom(this.accountResource, this.accountResource.getTotalAmount());
        this.accountResource.changeState(new CloseAccountState(this.accountResource));
    }
}
