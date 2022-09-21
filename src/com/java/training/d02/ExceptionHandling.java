package com.java.training.d02;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

@TrainingSession(
        trainingDay = TrainingDay.D02,
        topic = "exception handling",
        subtopics = {
                "checked exceptions",
                "unchecked exceptions",
                "try catch blocks"
        }
)
public class ExceptionHandling {

    public static void main(String[] args) {
        checkedExceptions();

        //uncheckedExceptions();
    }

    private static void checkedExceptions() {
        NumberFormat numberFormat = new DecimalFormat("####.##");
        try {
            final Number number = numberFormat.parse("63782323");
            System.out.println("The number is " + number);
            System.out.println(numberFormat.format(number));
        } catch (ParseException e) {
            //e.printStackTrace();
            System.err.println(e.getMessage());

            // exception type changing (checked --> unchecked, the same type)
            throw new RuntimeException(e);
        } catch (Exception e) {
            // the handling for exception
        } finally {
            System.out.println("Do something");
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
