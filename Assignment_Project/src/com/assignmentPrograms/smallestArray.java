package com.assignmentPrograms;

public class smallestArray {
	public static void main(String[] args) {
		int a [] = {14, -65, 78, 356, -145, 88, 56};
		int min = a[0];
		for (int i=0; i<a.length; i++) {
			if (a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("Minimum value = "+min);
	}

}
