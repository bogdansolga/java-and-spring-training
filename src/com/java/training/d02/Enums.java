package com.java.training.d02;

public class Enums {

    @SuppressWarnings("unused") // use it with moderation, not for unused variables
    public static void main(String[] args) {
        WeekDay weekDay = WeekDay.WEDNESDAY;
        WeekDay byName = WeekDay.valueOf("MONDAY");
        final WeekDay[] values = WeekDay.values();

        switch (weekDay) {
            case MONDAY:
                System.out.println("The week begins :-)");
                break;

            case WEDNESDAY:
                System.out.println("Spring is coming!");
                break;

            default:
                System.out.println("Let there be sun");
                break;
        }
    }
}
