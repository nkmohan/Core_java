package com.exception1;

import java.util.Scanner;

public class Identification {
	public static void main(String[] args) throws InvalidNumberException {
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		if(id<0) {
			throw new InvalidNumberException("Negative numbers won't accept");
		}
	}

}
