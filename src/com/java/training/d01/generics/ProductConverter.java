package com.java.training.d01.generics;

import com.java.training.model.Product;

public class ProductConverter implements Converter<String, Product> {

    @Override
    public Product convertFromInput(String string) {
        return new Product("x");
    }

    @Override
    public String convertFromOutput(Product product) {
        return product.toString();
    }
}
