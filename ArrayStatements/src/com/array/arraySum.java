package com.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class arraySum {
	public static void main(String[] args) throws Exception {
		
		  InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br =
		  new BufferedReader(isr); System.out.println("Enter the number : "); 
		  String str = br.readLine(); int num = Integer.parseInt(str);
		 
		int[] a = new int[] { 71, 22, 72, 12, 998 };
		int sum = a[0] + a[1] + a[2] + a[3] + a[4];
	}

}
