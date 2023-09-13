package com.array;

public class multiArrays {
	public static void main(String[] args) {
		int[][]a = new int[2][2];
		a [0][0] = 193;
		a [0][1] = 229;
		a [1][0] = 233;
		a [1][1] = 339;
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
