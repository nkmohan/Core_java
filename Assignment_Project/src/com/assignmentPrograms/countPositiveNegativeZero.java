package com.assignmentPrograms;

public class countPositiveNegativeZero {
	public static void main(String[] args) {
		int num[] = {-6,-4,-2,0,1,3,5};
		int positive = 0;
		int negative = 0;
		int zero = 0; 
		for (int i : num) {
			if ( i>0) positive++;
			else if(i<0) negative++;
			else zero++;
		}
		System.out.println(positive+" "+negative+" "+zero);
	}

}
