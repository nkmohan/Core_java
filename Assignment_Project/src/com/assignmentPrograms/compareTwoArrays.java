package com.assignmentPrograms;

public class compareTwoArrays {
	public static void main(String[] args) {
		int a[] = {10, 20, 30, 40, 50};
		int b[] = a;
		int c[] = {10, 20, 30, 40, 50};
		int d[] = {15, 25, 35, 45, 55};
		if (a == b) {
			System.out.println("a and b are same");
		}else {
			System.out.println("a and b are not same");
		}
		if (a == c) {
			System.out.println("a and c are same");
		}else {
			System.out.println("a and c are not same");
		}
		if (a == d) {
			System.out.println("a and d are same");
		}else {
			System.out.println("a and d are not same");
		}		
	}

}
