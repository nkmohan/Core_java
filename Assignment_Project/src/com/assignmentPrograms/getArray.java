package com.assignmentPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class getArray {
	public static void main(String[] args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		System.out.println("Enter the element : ");
		String str = br.readLine();
		int size = Integer.parseInt(str);
		int[] arr = new int[size];
		System.out.println("The size of Array is:"+arr.length);
	      System.out.println("Enter the Elemets ");
	      for(int i=0;i<size;i++) {
	    	  String str1=br.readLine();
	    	  arr[i]=Integer.parseInt(str1);
	      }
	      System.out.println(Arrays.toString(arr));

	}

}
