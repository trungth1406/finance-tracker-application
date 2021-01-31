package com.huutran.financetracker.services;

import com.huutran.financetracker.dao.Transaction;
import com.huutran.financetracker.model.TransactionResponse;
import com.huutran.financetracker.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService extends BaseService<Transaction, Long> {
    @Autowired
    TransactionRepository transactionRepository;

    @Override
    protected Repository getRepository() {
        return this.transactionRepository;
    }

    @Override
    protected <T> T toDTO(Transaction e) {
        return (T) new TransactionResponse()
                .id(Math.toIntExact(e.getId()))
                .amount(String.valueOf(e.getAmount()))
                .description(e.getDescription());
    }


}
