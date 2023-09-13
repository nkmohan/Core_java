package com.assignmentPrograms;


public class arrayAverage {
	public static void main(String[] args) {
		double a[] = {10, 20, 30, 40, 50};
		double sum = 0.0;
		double avg = 0.0;
		for (int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		avg = sum/a.length;
		System.out.println("The average is : "+avg);
	}

}
