package com.constructors;

public class Student {
	int id;
	String name;
	double fees;
	public Student(int id, String name, double fees){
		this.id = id;
		this.name = name;
		this.fees = fees;
		System.out.println(this.id+""+this.name+""+this.fees+"");
		
	}
}
