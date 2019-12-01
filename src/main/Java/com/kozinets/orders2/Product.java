package com.kozinets.orders2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String card;
    private String catalogCode;
    private String name;
    private String assortment;
    private String salesType;
    private String productLine;
    private double price;
    private String currency;
    //private Supplier supplier;

    public static class Builder {
        private String card;
        private String catalogCode;
        private String name;
        private String assortment;
        private String salesType;
        private String pdoductLine;
        private double price;
        private String currency;
        //private Supplier supplier;

        public Builder card(String val){
            this.card = val;
            return this;
        }
        public Builder catalogCode(String val){
            this.catalogCode = val;
            return this;
        }
        public Builder name(String val){
            this.name = val;
            return this;
        }
        public Builder assortment(String val){
            this.assortment = val;
            return this;
        }
        public Builder salesType(String val){
            this.salesType = val;
            return this;
        }
        public Builder pdoductLine(String val){
            this.pdoductLine = val;
            return this;
        }
        public Builder price(double val){
            this.price = val;
            return this;
        }
        public Builder currency(String val){
            this.currency = val;
            return this;
        }
        /*
        public Builder supplier(Supplier val){
            this.supplier = val;
            return this;
        }
        */
    }

    public Product(){}

    public Product(Builder builder){
        this.card = builder.card;
        this.catalogCode = builder.catalogCode;
        this.name = builder.name;
        this.assortment = builder.assortment;
        this.salesType = builder.salesType;
        this.productLine = builder.pdoductLine;
        this.price = builder.price;
        this.currency = builder.currency;
        //this.supplier = builder.supplier;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCatalogCode() {
        return catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssortment() {
        return assortment;
    }

    public void setAssortment(String assortment) {
        this.assortment = assortment;
    }

    public String getSalesType() {
        return salesType;
    }

    public void setSalesType(String salesType) {
        this.salesType = salesType;
    }

    public String getPdoductLine() {
        return productLine;
    }

    public void setPdoductLine(String pdoductLine) {
        this.productLine = pdoductLine;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
/*
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
*/
}