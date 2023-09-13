package com.arrays;

import java.util.Arrays;

public class missingNumber {
	public static void main(String[] args) {
		int[] num = {1,2,3,5,6,7,8};
		
		int[] temp = new int[num.length+1];
		
		for (int i=0; i<num.length; i++) {
			temp[i] =0;
		}
		for (int i=0; i<num.length+1; i++) {
			temp[num[i]]=1;
		}
		int j = 0;
		for(int i=0; i<num.length+1; i++) {
			if (temp[i]==0)
				j=i+1;
		}
		System.out.println(" "+Arrays.toString(num));
	}

}
