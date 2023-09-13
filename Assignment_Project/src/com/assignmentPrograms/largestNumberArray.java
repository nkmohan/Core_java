package com.assignmentPrograms;

public class largestNumberArray {
	public static void main(String[] args) {
		int a [] = {14, -65, 78, 356, -145, 88, 56};
		int max = a[0];
		for (int i=0; i<a.length; i++) {
			if (a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("Maximum value = "+max);
	}
}
