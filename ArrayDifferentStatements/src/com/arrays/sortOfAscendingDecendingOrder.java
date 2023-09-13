package com.arrays;

import java.util.Arrays;

public class sortOfAscendingDecendingOrder {
	public static void main(String[] args) {
		int [] num = {1,3,72,7,8,2,81,6};
		int temp = 0;
		for (int i=0; i<num.length; i++) {
			for (int j=i+1; j<num.length; j++) {
				if (num[i]<num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
				}
			}
		System.out.println("Descending order : "+Arrays.toString(num));
		for (int i=0; i<num.length; i++) {
			for (int j=i+1; j<num.length; j++) {
				if (num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("Ascending order : "+ Arrays.toString(num));
	}

}
