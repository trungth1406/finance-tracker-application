package com.huutran.financetrawcker.core.resource.state.base;

import java.math.BigDecimal;

public interface MoneyResourceState extends ResourceState {

    void onOpen(BigDecimal amount);


}
