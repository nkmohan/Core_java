package com.assignmentPrograms;

import java.util.Arrays;

public class removeOddNumbers {
	public static void main(String[] args) {
		int num[] = {2,-3,-4,7,6,8,-3};
		int countEven = 0;
		int even[] = null;
		for (int i : num) {
			if(i%2==0)
				++countEven;
		}
		even = new int[countEven];
		int i=0;
		for (int j : num) {
			if(j%2==0) {
				even[i++] = j; 
			}
		}
		System.out.println("Array after removing odd number are : "+Arrays.toString(even));
		
	}

}
