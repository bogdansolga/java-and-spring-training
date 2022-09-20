package com.java.training.d01.repository;

import com.java.training.model.Product;

public class FileSystemRepository implements ProductRepository {
    @Override
    public Product getByName(String name) {
        return new Product(name);
    }
}
