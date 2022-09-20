package com.java.training.d01;

import com.java.training.model.Product;

// data processing class --> processes Product objects
public class ProductService {

    public void saveProduct(Product product) {
        System.out.println("Saving the product...");
    }

    public Product getProduct(String name) {
        return new Product();
    }
}
