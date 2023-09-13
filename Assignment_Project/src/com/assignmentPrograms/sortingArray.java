package com.assignmentPrograms;

public class sortingArray {
	public static void main(String[] args) {
		int [] arr= {50, 25, 30, 55, 15};
		int min = arr[0];
		int max = arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>max) {
				max = arr [i];
			}
			if (arr[i]<min) {
				min = arr [i];
			}
		}
		System.out.println("Minimum value = "+min);
		System.out.println("Maximum value = "+max);
	}


}
