package com.assignmentPrograms;

public class OddEvenArray {
	public static void main(String[] args) {
		int arr[] =  {12, 34, 46, 76, 11, 34, 21};
		int odd = 0;
		int even = 0;
		 for (int i=0; i<arr.length; i++) {
			 if (arr[i]%2==0)
				 ++even;
			 else
				 ++odd;
		 }	
		 System.out.println("Count of the even numbes = "+even);
		 System.out.println("Count of the odd numbers = "+odd);
	}

}