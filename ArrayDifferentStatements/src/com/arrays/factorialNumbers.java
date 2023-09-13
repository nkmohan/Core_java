package com.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class factorialNumbers {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader  br = new BufferedReader(isr);
		System.out.println("Enter the number : ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		int fact = 1;
		for (int i=1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println("factorial of "+num+" is: "+fact);
	}

}
