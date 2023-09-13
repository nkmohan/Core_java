package com.something;

public class Employee {
	public static void main(String[] args) {
	Employee e = new Employee();
	Employee e1 = new Employee();
	if(e1 instanceof Employee) {
		System.out.println("yes it is correct");
	}else {
		
		System.out.println("it is not correct");
	}
	}
}
