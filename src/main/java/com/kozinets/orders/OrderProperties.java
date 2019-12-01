package com.kozinets.orders;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderProperties {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public OrderProperties(){}


}