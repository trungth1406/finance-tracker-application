package com.huutran.financetrawcker.core.resource;

import java.math.BigDecimal;

public abstract class BaseFinanceResource implements FinanceResource {

    protected BigDecimal totalAmount;
    protected String name;

    public BaseFinanceResource(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BaseFinanceResource(BigDecimal totalAmount, String name) {
        this.totalAmount = totalAmount;
        this.name = name;
    }

    @Override
    public void withdrawFrom(FinanceResource resource, BigDecimal withAmount) {
        resource.withDraw(withAmount);
        this.deposit(withAmount);
    }

    @Override
    public void depositTo(FinanceResource toResource, BigDecimal withAmount) {
        toResource.deposit(withAmount);
        this.withDraw(withAmount);
    }

    @Override
    public FinanceResource withDraw(BigDecimal amount) {
        this.totalAmount = this.totalAmount.subtract(amount);
        return this;
    }

    @Override
    public FinanceResource deposit(BigDecimal amount) {
        this.totalAmount = this.totalAmount.add(amount);
        return this;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public String getName() {
        return name;
    }
}
