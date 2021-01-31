package com.huutran.financetracker.services;

import com.huutran.financetracker.model.ResourceResponse;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.huutran.financetracker.repositories.MoneyResourceRepository;
import com.huutran.financetracker.utility.SFWhere;
import com.huutran.financetracker.dao.MoneyResource;

import java.math.BigDecimal;
import java.util.List;


@Service
public class MoneyResourceService extends BaseService<MoneyResource, Long> {


    @Autowired
    MoneyResourceRepository moneyResourceRepository;

    @Override
    protected Repository getRepository() {
        return this.moneyResourceRepository;
    }

    @Override
    protected <T> T toDTO(MoneyResource e) {
        return (T) new ResourceResponse()
                .id(BigDecimal.valueOf(e.getId()))
                .name(e.getName())
                .totalAmount(String.valueOf(e.getTotalAmount()));
    }

    @Override
    public <T> ResponseEntity<List<T>> searchAll(Pageable pageable) {
        Page<MoneyResource> all = this.moneyResourceRepository.findAll(pageable);
        List<Object> objects = this.prepareCollectionResponse(all.toList());
        return new ResponseEntity(objects, HttpStatus.OK);
    }
}
