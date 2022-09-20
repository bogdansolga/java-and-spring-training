package com.java.training.d01.generics;

import java.util.ArrayList;
import java.util.List;

// a class which defines a generic type of data
public class Stack<Element> {
    private final List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        // add the element to an internal structure
        elements.add(element);
    }

    public Element getElement(int index) {
        return elements.get(index);
    }

    public static <Type> void displayItems(List<Type> items) {
    }
}
