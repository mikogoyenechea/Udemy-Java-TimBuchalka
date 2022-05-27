package com.controlflowstatements;

/*
 * A perfect number is a positive integer which is equal to the sum of its proper positive divisors. 
 * Proper positive divisors are positive integers that fully divide the perfect number without 
 * leaving a remainder and exclude the perfect number itself.
 * 
 * Write a method named isPerfectNumber with one parameter of type int named number.
 * If number is < 1, the method should return false. 
 * The method must calculate if the number is perfect. If the number is perfect, the method should return true; 
 * otherwise, it should return false. 
 */

public class PerfectNumber {

    public static boolean isPerfectNumber (int number) {
        int adding = 0;
        if (number<1) {
            return false;
        }
        else {
            for (int i = 1; i < (number); i++) {
                int remainder = number%i;
                if (remainder == 0) {
                    adding = adding + i;

                }
            }
            return  (adding == number);

        }
    }
}