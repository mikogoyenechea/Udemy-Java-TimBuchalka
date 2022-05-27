package com.expressionsstatementsmethods;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if(minutes<0){
            System.out.println("Invalid Value");
        }
        else {
            long hours = minutes/60;
            long days = hours/24;
            long years = days/365;
            long remainderDays = days%365;
            System.out.format("%s min = %s y and %s d",minutes,years,remainderDays);
        }
    }
}
