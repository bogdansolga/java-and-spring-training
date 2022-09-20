package com.java.training.d01;

public class DataTypesDemo {

    public static void main(String[] args) {
        // primitives examples
        int timeOfDay = 10;
        boolean isSunnyToday = true;
        double salary = 300000.5;

        // wrapper classes
        Integer dayOfMonth = 20;
        System.out.println("The max integer value is " + Integer.MAX_VALUE);
        System.out.println(Integer.parseInt("23")); // parsing a String value

        // operands
        System.out.println(10 * 20);
        System.out.println(30 / 7);
        System.out.println("something " + "else");

        // ternary operator
        String todayWeather = isSunnyToday ? "nice" : "ugly";

        controlStatements();
    }

    private static void controlStatements() {
        String value = "something";

        switch (value) {
            case "something":
                System.out.println("OK");
                return; // end the processing

            case "else":
                System.out.println("not");
                //continue; // cannot be used in switch statements
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) { // is even
                System.out.println(i + " is even");
                continue;
            } else {
                // do something
            }
        }
    }
}
