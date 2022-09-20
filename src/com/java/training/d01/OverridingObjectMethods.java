package com.java.training.d01;

import com.java.training.model.Product;

public class OverridingObjectMethods {

    public static void main(String[] args) {
        Product product = new Product("Aspirator");
        System.out.println(product.toString());

        String something = "something";
        Integer value = 235;
        System.out.println(value.equals(something));
    }
}
