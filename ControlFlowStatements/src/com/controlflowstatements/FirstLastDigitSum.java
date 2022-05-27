package com.controlflowstatements;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number) {

        if (number<0) {
            return -1;
        }
        else {
            int lastNumber = number%10;
            String charNumber = Integer.toString(number);
            String charFirstNumber = charNumber.substring(0,1);
            int firstNumber = Integer.parseInt(charFirstNumber);
            return (lastNumber+firstNumber);
        }
    }
}
