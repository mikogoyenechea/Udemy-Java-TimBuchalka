package com.controlflowstatements;

/*
 * Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
 * If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
 * The method should return the greatest common divisor of the two numbers (int).
 * The greatest common divisor is the largest positive integer that can fully divide each of the integers 
 * (i.e. without leaving a remainder). 
 */

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second) {
        int divisorFirst = 0;
        int divisorSecond;
        if (first<10 || second<10) {
            return -1;
        }
        else {

            for (int i=first;i>0;i--) {
                int remainderFirst = first%i;
                if (remainderFirst == 0) {
                    divisorFirst = i;
                    for (int j=second;j>0;j--) {
                        if (second%j==0) {
                            divisorSecond=j;
                            if(divisorFirst==divisorSecond) {
                                return divisorFirst;
                            }
                        }
                    }
                }
            }
        }
        return divisorFirst;
    }
}
