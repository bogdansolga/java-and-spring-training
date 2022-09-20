package com.java.training.model;

// 'is a' relationship
public class Phone extends Product {

    private int fancinessLevel;

    public int getFancinessLevel() {
        return fancinessLevel;
    }

    public void setFancinessLevel(int fancinessLevel) {
        this.fancinessLevel = fancinessLevel;
    }

    @Override
    public void displayName() {
        System.out.println("Displaying the phone " + getName());
    }
}
