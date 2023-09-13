package com.array;

import java.util.*;

public class minAndMax {
	public static void main(String[] args) {
//		Write a java program to find min and max elements in the array
//		int arr [ ] = { 15, 8, 9, 2, 11, 4 }
		int [] arr = {15, 8, 9, 2, 11, 4 };
		
		Arrays.sort(arr);
		System.out.println("Min Element : " + arr[0] );
		System.out.println("Max Element : " + arr[arr.length-1]);
		}
}
