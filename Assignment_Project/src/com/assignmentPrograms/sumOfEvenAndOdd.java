package com.assignmentPrograms;

public class sumOfEvenAndOdd {
	public static void main(String[] args) {
		int num[] = {12,53,6,21,83,9,73,97};
		int evenSum = 0;
		int oddSum = 0;
		for (int a : num) {
			if(a%2==0) {
				evenSum += a;
			}else {
				oddSum += a;
			}
		}
		System.out.println("Even numbers sum = "+evenSum);
		System.out.println("Odd numbers sum = "+oddSum);
	}

}
