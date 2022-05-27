package com.controlflowstatements;

public class SumOddRange {

    public static boolean isOdd (int number) {
        if (number<1) {
            return false;
        }
        else {
            int remainder = number%2;
            return remainder != 0;
        }
    }

    public static int sumOdd (int start, int end) {
        int sumTotal = 0;
        if (end<1 || start<1 || start>end) {
            return -1;
        }
        else {
            for (int i = start;i<(end+1);i++) {
                if(isOdd(i)) {
                    sumTotal=sumTotal+i;
                }

            }
        }
        return sumTotal;
    }
}

