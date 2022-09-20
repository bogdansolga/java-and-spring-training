package com.java.training.d01;

import com.java.training.d01.repository.ProductRepository;
import com.java.training.model.Product;

// data processing class --> processes Product objects
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProduct(Product product) {
        System.out.println("Saving the product...");
    }

    public Product getProduct(String name) {
        return productRepository.getByName(name);
    }
}
