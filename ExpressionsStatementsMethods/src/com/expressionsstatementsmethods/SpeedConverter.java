package com.expressionsstatementsmethods;

/*
 * Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour.
 * This method needs to return the rounded value of the calculation of type long.
 * 
 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to 
 * return -1 to indicate an invalid value.
 * 
 * Otherwise, if it is positive, calculate the value of miles per hour, 
 * round it and return it. For conversion and rounding, check the notes in the text below. 
 */

public class SpeedConverter {

    public static long toMilesPerHour (double kilometersPerHour) {
        long value = 0;
        if(kilometersPerHour<0) {
            return -1;
        }
        else {
            value = (long) Math.round(kilometersPerHour/1.609);

            return value;
        }
    }

    public static void printConversion (double kilometersPerHour){
        int milesPerHourConverted = 0;

        if(kilometersPerHour<0) {
            System.out.println("Invalid Value");
        }
        else {
            milesPerHourConverted = (int) toMilesPerHour(kilometersPerHour);
            System.out.format("%s km/h = %s mi/h", kilometersPerHour, milesPerHourConverted);
        }
    }
}