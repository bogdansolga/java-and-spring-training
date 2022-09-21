package com.java.training.d02;

public enum WeekDay {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3);

    private final int dayNumber;

    WeekDay(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return dayNumber;
    }
}
