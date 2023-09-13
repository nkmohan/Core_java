package com.arrays;

public class alternativeEvenNumbers {
	public static void main(String[] args) {
		int[] num = {12, 34,99, 2, 44, 23, 48};
		int count = 0;
		int[] temp = new int[count];
		for (int i=0; i<num.length; i++) {
			if (num[i]%2==0) {
				count++;
				if(count%2!=0) {
					System.out.print(num[i]+" ");
				}
			}
		}
	}
}
