package com.huutran.financetracker.dao;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private BigDecimal name;

    @Column(name = "TOTAL_AMOUNT")
    private BigDecimal totalAmount;

    @Column(name = "FK_RESOURCE")
    private Long fkResource;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getName() {
        return this.name;
    }

    public void setName(BigDecimal name) {
        this.name = name;
    }

    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getFkResource() {
        return this.fkResource;
    }

    public void setFkResource(Long fkResource) {
        this.fkResource = fkResource;
    }
}
