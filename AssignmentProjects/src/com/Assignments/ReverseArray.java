package com.Assignments;

public class ReverseArray {
	
	public static void main(String[] args) {

		
		int arr [ ] = {  7, 27,6, 8, 14, 19, 2, 5 } ; 
		
      int temp = 0;
      
		for ( int i = 0 ; i < arr.length/2 ; i++){
			
			temp = arr[i];
			
			arr[i] = arr[arr.length-1-i];
			
			arr[arr.length-1-i] = temp;
			
		}
		for ( int i = 0 ; i < arr.length ; i++){
			
			System.out.print(arr[i]+",");
		}
		}

}
