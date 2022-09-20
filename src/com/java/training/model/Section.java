package com.java.training.model;

import java.util.List;

public class Section {

    private String name;
    // 'has a' relationship
    private List<? extends Product> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<? extends Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
