package com.controlflowstatements;

public class SharedDigit {

    public static boolean hasSharedDigit (int first, int second) {

        if (first<10 || first>99 || second<10 || second>99) {
            return false;
        }
        else {
            String charFirst = Integer.toString(first);
            String charSecond = Integer.toString(second);
            String charCompare;
            for (int i=0; i<charFirst.length();i++) {
                charCompare = charFirst.substring(i,1+i);
                for (int j = 0;j<charSecond.length();j++) {
                    String charCompare2 = charSecond.substring(j,j+1);
                    if (charCompare.equals(charCompare2)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}