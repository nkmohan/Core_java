package com.assignmentPrograms;

public class StringToCharArray {
	public static void main(String[] args) {
		String s = "hello mohan";
		char[] ch = new char[s.length()];
		for (int i=0; i<s.length(); i++) {
			ch[i] = s.charAt(i);
		}
			for (char c : ch) {
				System.out.println(c);
			}
	}

}
