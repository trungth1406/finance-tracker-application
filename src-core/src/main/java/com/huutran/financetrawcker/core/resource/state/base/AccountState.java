package com.huutran.financetrawcker.core.resource.state.base;

import com.huutran.financetrawcker.core.resource.MoneyResource;

import java.math.BigDecimal;

public interface AccountState {

    void onOpen(BigDecimal amount, MoneyResource fromResource);

    void onClose();


}
