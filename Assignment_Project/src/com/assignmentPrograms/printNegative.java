package com.assignmentPrograms;

public class printNegative {
	public static void main(String[] args) {
		int num[] = {1, -3, 9, 23, -9, 4, 0};
		int n = 0;
		boolean flag = true;
		for (int i=0; i<num.length; i++) {
			if (num[i]<0) {
				flag = false;
				break;
			}
		}
		if(!flag) {
		      System.out.println("Array doesn’t contain negative number.");
		      return;
		    }
	    for (int i=0; i< num.length; i++) {
	      if(num[i] < 0) {
	        System.out.print(num[i]+" ");
	        System.out.println("Negative numbers = ");
	      }
	    }
	}

}
