package com.assignmentPrograms;

import java.util.Arrays;

public class putEvenAndOdd {
	public static void main(String[] args) {
		int num[] = {12,34,43,25,74,85,75,54,98};
		int countEven = 0;
		int countOdd = 0;
		int even[] = null;
		int odd[] = null;
		for (int i=0; i<num.length; i++) {
			if(i%2==0)
			++countEven;
			else
				++countOdd;
		}
		countOdd = num.length-countEven;
		even = new int[countEven];
		odd = new int[countOdd];
		int i = 0;
	    int j = 0;
	    for (int a : num) {
	      if (a % 2 == 0) { 
	        even[i++] = a;
	      } else {
	        odd[j++] = a;
	      }
	    }
	    System.out.println("Even numbers : "+Arrays.toString(even));
	    System.out.println("Odd numbers : "+Arrays.toString(odd));
	}

}