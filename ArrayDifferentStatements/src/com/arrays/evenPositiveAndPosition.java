package com.arrays;

public class evenPositiveAndPosition {
	public static void main(String[] args) {
		int[] num = {12,-3, 8, -22, -32, 82, 38, 60};
		for (int i=0; i<num.length;i++) {
			if (i%2==0 && num[i]%2==0) {
			System.out.print(num[i]+" ");
			}
		}
	}

}
