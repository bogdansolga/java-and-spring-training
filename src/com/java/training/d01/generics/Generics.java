package com.java.training.d01.generics;

import com.java.training.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        aCollectionWithoutGenerics();

        aCollectionUsingGenerics();

        usingAGenericDefinedClass();
    }

    private static void aCollectionWithoutGenerics() {
        List list = new ArrayList();
        list.add("apples");
        list.add(24);
        list.add(new Product());
    }

    private static void aCollectionUsingGenerics() {
        List<String> strings = new ArrayList<>();
        strings.add("something");
        //strings.add(new Product());
    }

    private static void usingAGenericDefinedClass() {
        Stack<String> strings = new Stack<>();
        strings.add("something");
        final String element = strings.getElement(0);

        Stack<Product> products = new Stack<>();
        products.add(new Product("Cookies"));
    }
}
