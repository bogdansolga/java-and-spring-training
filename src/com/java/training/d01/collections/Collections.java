package com.java.training.d01.collections;

import com.java.training.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

    public static void main(String[] args) {
        //lists();
        //sets();
        //maps();

        //sortingAList();
        //sortingASet();

        iteratingOverACollection();
    }

    private static void lists() {
        List<String> strings = new ArrayList<>(2);
        strings.add("something");
        strings.add("else");

        final String value = strings.get(0);
        System.out.println("The value on the 1st index is " + value);
        strings.remove(1);

        java.util.Collections.sort(strings);

        // CRUD = Create Read Update Delete
    }

    private static void sets() {
        Set<String> strings = new HashSet<>(2);
        strings.add("something");
        strings.add("else");
        strings.add("else");

        System.out.println("There are " + strings.size() + " values");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static void maps() {
        Map<String, String> strings = new HashMap<>();
        strings.put("key", "value");
        strings.put("something", "else");

        final Set<String> keySet = strings.keySet();
        final Collection<String> values = strings.values();
    }

    private static void sortingASet() {
        Set<Product> products = new TreeSet<>(); // ordered set
        products.add(new Product("Lemonade"));
        products.add(new Product("Ice cream"));
        products.add(new Product("Cookies"));

        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void sortingAList() {
        List<Product> products = new ArrayList<>(); // unordered, by default
        products.add(new Product("Ice cream"));
        products.add(new Product("Cookies"));
        products.add(new Product("Lemonade"));

        java.util.Collections.sort(products);
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void iteratingOverACollection() {
        List<String> strings = new ArrayList<>(Arrays.asList("a very long sentence".split(" ")));
        System.out.println(strings);

        System.out.println("There are " + strings.size() + " elements");

        for (int i = strings.size() - 1; i >= 0; i--) {
            final String removed = strings.remove(i);
            System.out.println("Removed the value '" + removed + "'");
        }

        System.out.println("The array is now " + strings);

        for (String string : strings) {
            if (string.length() == 4) {
                // strings.remove(string); throws a ConcurrentModificationException
            }
        }
        //System.out.println(strings);

        final Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            final String nextElement = iterator.next();
            if (nextElement.length() == 4) {
                iterator.remove();
            }
        }

        //System.out.println(strings);

        Map<String, String> map = new HashMap<>();
        map.put("something", "else");

        // 1 - key set
        map.keySet().iterator();

        // 2 - values
        map.values().iterator();

        // 3 - entries
        final Set<Map.Entry<String, String>> entries = map.entrySet();
        entries.iterator();
    }
}
