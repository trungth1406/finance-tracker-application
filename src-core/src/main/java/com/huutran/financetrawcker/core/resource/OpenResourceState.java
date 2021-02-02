package com.huutran.financetrawcker.core.resource;

import com.huutran.financetrawcker.core.resource.MoneyResource;
import com.huutran.financetrawcker.core.resource.state.base.MoneyResourceState;

import java.math.BigDecimal;

public class OpenResourceState implements MoneyResourceState {

    private MoneyResource moneyResource;

    @Override
    public void onOpen(BigDecimal amount) {
        this.moneyResource.withDraw(amount);
    }

    @Override
    public void onClose() {

    }
}
