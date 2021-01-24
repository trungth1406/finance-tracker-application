package com.huutran.financetrawcker.core.resource;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MoneyResource extends BaseFinanceResource {

    private List<FinanceResource> relatedAccounts = new ArrayList<>();


    public MoneyResource(BigDecimal totalAmount) {
        super(totalAmount);
    }

    public MoneyResource(BigDecimal totalAmount, List<FinanceResource> relatedAccounts) {
        super(totalAmount);
        this.relatedAccounts = relatedAccounts;
    }

    public FinanceResource addRelatedAccount(BigDecimal initialAmount) {
        FinanceResource newAccount = new AccountResource(initialAmount, this);
        this.relatedAccounts.add(newAccount);
        return newAccount;
    }



}
