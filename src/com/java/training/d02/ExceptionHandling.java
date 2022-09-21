package com.java.training.d02;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class ExceptionHandling {

    public static void main(String[] args) {
        //checkedExceptions();

        uncheckedExceptions();
    }

    private static void checkedExceptions() {
        NumberFormat numberFormat = new DecimalFormat("####.##");
        try {
            final Number number = numberFormat.parse("something");
        } catch (ParseException e) {
            //e.printStackTrace();
            System.err.println(e.getMessage());

            // exception type changing (checked --> unchecked, the same type)
            throw new RuntimeException(e);
        }
    }

    private static void uncheckedExceptions() {
        String number = "236";
        // throws a NumberFormatException --> an unchecked exception
        //Integer parsedValue = Integer.parseInt(number);
        //System.out.println("The parsed value is " + parsedValue);

        Integer value = correctStringParsing(number);
        System.out.println("The reliably parsed value is " + value);
    }

    private static Integer correctStringParsing(String number) {
        try {
            // happy path --> the string contains a valid Integer number
            return Integer.parseInt(number);
        } catch (NumberFormatException ex) {
            System.err.println("The number could not be parsed");

            // unhappy path --> returning a default value
            //return 0;

            throw new IllegalArgumentException("Please supply a correct number");
        }
    }
}
