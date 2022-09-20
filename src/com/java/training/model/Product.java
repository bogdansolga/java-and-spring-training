package com.java.training.model;

// data holding class --> holds details about a product
public class Product extends AbstractEntity {

    // static + final --> creating constants
    private static final String TABLE_NAME = "product";

    static {
        System.out.println("Executed just on the first initialization");
    }

    private String name; // field / property

    public Product() {
    }

    public Product(String name) {
        // this.name --> the 'name' property from the current object
        this.name = name;
    }

    // camelCase --> first letter is in lower case, each subsequent word
    // begins with upper case
    public final String getName() { // getter method
        return name;
    }

    public final void setName(String name) { // setter m.
        this.name = name;
    }

    public static Product createProduct(String name) {
        return new Product(name);
    }

    public void displayName() {
        System.out.println("Displaying the product " + name);
    }

    @Override
    public String toString() {
        return "Product {" +
                "name: '" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public void displayType() {

    }
}
