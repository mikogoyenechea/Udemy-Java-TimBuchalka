package com.controlflowstatements;

public class NumberPalindrome {

    public static boolean isPalindrome (int number) {
        int reverse = 0;
        int lastDigit = 0;
        int positive;
        if (number<0) {
            positive=-1*number;
        }
        else positive = number;

        while (positive>0) {
            lastDigit = positive%10;
            reverse = reverse*10 + lastDigit;
            positive = positive/10;
        }
        if (number<0) {
            positive = -1*number;
        }
        else positive=number;
        return (positive==reverse);
    }
}
