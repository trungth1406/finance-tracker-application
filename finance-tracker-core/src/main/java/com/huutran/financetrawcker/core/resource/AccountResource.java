package com.huutran.financetrawcker.core.resource;

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


}
