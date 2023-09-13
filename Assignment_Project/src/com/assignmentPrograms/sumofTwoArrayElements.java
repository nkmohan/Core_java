package com.assignmentPrograms;

public class sumofTwoArrayElements {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {50, 40, 30, 20, 10};
		int[] arr3 = new int[arr1.length];
		for (int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		for (int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
	}

}
