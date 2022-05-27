package com.controlflowstatements;

public class LastDigitChecker {

    public static boolean hasSameLastDigit (int first, int second, int third) {

        if (first<10 || second<10 || third<10 || first>1000 || second>1000 || third>1000) {
            return false;
        }
        else {
            int lastFirst = first%10;
            int lastSecond = second%10;
            int lastThird = third%10;
            if (lastFirst==lastSecond || lastFirst==lastThird 
            		|| lastSecond==lastThird) {
                return true;
            }
            else return false;
        }
    }

    public static boolean isValid (int valid) {
        if (valid<10 || valid>1000) {
            return false;
        }
        return true;
    }
}