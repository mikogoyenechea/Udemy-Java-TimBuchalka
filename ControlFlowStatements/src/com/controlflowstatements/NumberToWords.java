package com.controlflowstatements;

public class NumberToWords {
	
	public static void numberToWords(int number) {
		
		if(number < 0) {
			System.out.println("Invalid Value");
		} else if (number == 0) {
			System.out.println("Zero");
		} else {
			int origNum = reverse(number);
			while (origNum != 0) {
				int digit = origNum % 10;
				switch(digit) {
					case 1:
						System.out.println("One");
						break;
					case 2:
						System.out.println("Two");
						break;
					case 3:
						System.out.println("Three");
						break;
					case 4:
						System.out.println("Four");
						break;
					case 5:
						System.out.println("Five");
						break;
					case 6:
						System.out.println("Six");
						break;
					case 7:
						System.out.println("Seven");
						break;
					case 8:
						System.out.println("Eight");
						break;
					case 9:
						System.out.println("Nine");
						break;
					case 0:
						System.out.println("Zero");
						break;
				}
				origNum /= 10;
			}
			for (int i=0; i<(getDigitCount(number)-getDigitCount(reverse(number))); i++) {
				System.out.println("Zero");
			}
		}	
	}
	
	public static int reverse (int number) {
		int newNum = 0;
		int origNum = number;
		while (origNum != 0) {
			int digit = origNum % 10;
			newNum += digit;
			newNum *= 10;
			origNum /= 10;
			}
			newNum /= 10;
			return newNum;
	}
	
	public static int getDigitCount (int number) {
		if (number < 0) {
			return -1;
		} else {
			int length = String.valueOf(number).length();
			return length;
		}
	}
}
