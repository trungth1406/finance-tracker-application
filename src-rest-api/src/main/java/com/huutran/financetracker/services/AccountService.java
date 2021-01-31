package com.huutran.financetracker.services;

import com.huutran.financetracker.model.AccountResponse;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.huutran.financetracker.repositories.AccountRepository;
import com.huutran.financetracker.utility.SFWhere;
import com.huutran.financetracker.dao.Account;

import java.math.BigDecimal;


@Service
public class AccountService extends BaseService<Account, Long> {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    protected Repository getRepository() {
        return this.accountRepository;
    }

    @Override
    protected AccountResponse toDTO(Account e) {
        return new AccountResponse()
                .id(BigDecimal.valueOf(e.getId()))
                .totalAmount(String.valueOf(e.getTotalAmount()))
                .remainAmount(String.valueOf(e.getTotalAmount()));
    }
}
