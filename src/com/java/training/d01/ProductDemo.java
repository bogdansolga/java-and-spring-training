package com.java.training.d01;

import com.java.training.model.Product;

public class ProductDemo {

    public static void main(String[] args) {
        Product p = new Product();
        p.setName("Phone");
        System.out.println(p.getName());

        Product another = new Product();
        another.setName("Cookie");
        System.out.println(another.getName());

        Product withoutName = new Product();
        System.out.println(withoutName.getName());

        Product staticallyCreated =
                Product.createProduct("Ice cream");
        System.out.println("We want more " + staticallyCreated.getName());
    }
}
