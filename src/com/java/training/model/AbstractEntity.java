package com.java.training.model;

// marker class --> a common parent for many classes
public abstract class AbstractEntity {

    public abstract void displayType();

    public void displayName() {
        System.out.println("Displaying the name");
    }
}
