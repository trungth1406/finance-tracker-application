package com.huutran.financetracker.services;

import com.huutran.financetracker.dao.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseService<Entity, ID> {


    protected  abstract  Repository getRepository();

    protected abstract <T> T toDTO(Entity e);

    public <T> ResponseEntity<List<T>> searchAll(Pageable pageable) {
        Page<Entity> all = ((JpaSpecificationExecutor<Entity>) this.getRepository()).findAll(null, pageable);
        List<Entity> entities = all.toList();
        List<T> dtos = prepareCollectionResponse(entities);
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    public <T> ResponseEntity<List<T>> searchBy(Specification<Entity> spec, Pageable pageable) {
        Page<Entity> all = ((JpaSpecificationExecutor<Entity>) this.getRepository()).findAll(spec, pageable);
        List<T> dtos = this.prepareCollectionResponse(all.toList());
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    protected  <T> List<T> prepareCollectionResponse(List<Entity> entities) {
        List<T> dtos = new ArrayList<>();
        for (Entity e : entities) {
            T response = this.toDTO(e);
            dtos.add(response);
        }
        return dtos;
    }


}
