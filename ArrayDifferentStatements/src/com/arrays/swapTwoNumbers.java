package com.arrays;

public class swapTwoNumbers {
	public static void main(String[] args) {
		int [] num = {12, 23, 43, 56, 47, 83};
		int temp = 0;
		for (int i=0; i<num.length-1; i+=2) {
			temp = num[i];
			num[i] = num[i+1];
			num[i+1] = temp;
		}
		for (int a : num) {
			System.out.print(a+" ");
		}
	}

}
