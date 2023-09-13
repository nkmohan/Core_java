package com.assignmentPrograms;

public class mergedArray {
	public static void main(String[] args) {
		int arr1[] = {12,34,45,78,90};
		int arr2[] = {95,87,65,43,21};
		int arr3[] = new int[arr1.length + arr2.length];
		for (int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int i=0; i<arr2.length; i++) {
			arr3[arr1.length+i] = arr2[i]; 
		}
		for (int a : arr3) {
			System.out.print(a+" ");
		}
	}

}
