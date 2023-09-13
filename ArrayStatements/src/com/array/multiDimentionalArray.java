package com.array;

public class multiDimentionalArray {
	public static void main(String[] args) {
		int [][] arr = {{92,99,98},{22,28,92}};
		for (int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
