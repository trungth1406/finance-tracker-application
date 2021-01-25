package com.huutran.financetracker.dao;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "MONEY_RESOURCE")
public class MoneyResource {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TOTAL_AMOUNT")
    private BigDecimal totalAmount;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
