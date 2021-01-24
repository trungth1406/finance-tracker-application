package com.huutran.financetrawcker.core.resource;

import java.math.BigDecimal;

public interface FinanceResource {

    void withdrawFrom(FinanceResource resource, BigDecimal withAmount);

    void depositTo(FinanceResource toResource, BigDecimal withAmount);

    FinanceResource withDraw(BigDecimal amount);

    FinanceResource deposit(BigDecimal amount);
}
