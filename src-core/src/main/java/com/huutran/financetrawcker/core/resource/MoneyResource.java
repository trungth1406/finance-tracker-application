package com.huutran.financetrawcker.core.resource;

import com.huutran.financetrawcker.core.resource.state.base.AccountState;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MoneyResource extends BaseFinanceResource {

    private List<AccountResource> relatedAccounts = new ArrayList<>();
    private AccountState state;


    public MoneyResource(BigDecimal totalAmount) {
        super(totalAmount);
    }

    public MoneyResource(BigDecimal totalAmount, List<AccountResource> relatedAccounts) {
        super(totalAmount);
        this.relatedAccounts = relatedAccounts;
    }

    public FinanceResource addRelatedAccount(BigDecimal initialAmount) {
        AccountResource newAccount = new AccountResource(initialAmount, this);
        this.relatedAccounts.add(newAccount);
        return newAccount;
    }

    public void closeAllAccounts() {
        this.relatedAccounts.forEach(AccountResource::close);
    }


}
