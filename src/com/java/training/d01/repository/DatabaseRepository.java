package com.java.training.d01.repository;

import com.java.training.model.Product;

public class DatabaseRepository implements ProductRepository {

    @Override
    public Product getByName(String name) {
        //return null; remember the psycho
        return new Product();
    }
}
