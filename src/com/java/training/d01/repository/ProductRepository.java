package com.java.training.d01.repository;

import com.java.training.model.Product;

// defines the contract, not the actual implementation
public interface ProductRepository {

    Product getByName(String name);
}
