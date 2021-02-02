package com.huutran.financetrawcker.core.transaction;

import com.huutran.financetrawcker.core.resource.FinanceResource;
import org.springframework.transaction.reactive.TransactionContext;

public abstract class BaseTransaction implements Transaction {

    protected TransactionContext context;




}
