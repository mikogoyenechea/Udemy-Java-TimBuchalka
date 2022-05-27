package com.controlflowstatements;

public class EvenDigitSum {

    public static int getEvenDigitSum (int number) {

        if (number<0) {
            return -1;
        }
        else {
            int evenSum = 0;
            String charNumber = Integer.toString(number);
            for (int i = 0;i<(charNumber.length());i++) {
                String charWorkingNumber = charNumber.substring(i,1+i);
                int workingNumber = Integer.parseInt(charWorkingNumber);
                if (workingNumber%2==0) {
                    //is even
                    evenSum = evenSum + workingNumber;
                }
            }
            return evenSum;
        }
    }
}

