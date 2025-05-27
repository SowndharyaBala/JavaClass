package com.practice;

public class Exception_Handling {

	public static void main(String[] args) {
		
		int a = 10;
		int b= 0;
		
//		try {
// 		  int c = a/b;		
//		}catch(ArithmeticException e) {
//			System.err.println(e);
//		}
		try {
			int [] arr = new int[4] ;
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
     	}
	}

}
