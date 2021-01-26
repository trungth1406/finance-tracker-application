package com.huutran.financetracker.repositories;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.huutran.financetracker.dao.MoneyResource;

@Repository
public interface MoneyResourceRepository extends CrudRepository<MoneyResource,Long>,PagingAndSortingRepository<MoneyResource,Long>,JpaSpecificationExecutor<MoneyResource>{

}