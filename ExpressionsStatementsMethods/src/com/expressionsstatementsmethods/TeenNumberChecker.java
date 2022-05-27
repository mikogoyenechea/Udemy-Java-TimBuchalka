package com.expressionsstatementsmethods;

public class TeenNumberChecker {
	
    public static boolean isTeen(int first, int second, int third) {
        return ((first>12 && first<20) || (second>12 && second<20) || (third>12 && third<20));
    }
}
