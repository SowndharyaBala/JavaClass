package com.practice;


class CustomException extends Exception{
	public CustomException(String message) {
		super(message);
	}

}


public class Exception_Handling {
	
	public static void validateAge(int age) throws CustomException{
		if(age <18) {
			throw new CustomException("Age has to be above 18");
		}else {
			throw new CustomException("age is sufficient");
		}
	}

	public static void main(String[] args) {
		
		try {
			validateAge(18);
			validateAge(45);
		}
		catch(CustomException e) {
			System.out.println(e);
		}
		
		
	//	try {
	//		System.out.println("outer try block");
		
		
//		try {
// 		  int c = a/b;		
//		}catch(ArithmeticException e) {
//			System.err.println(e);
//		}
//		try {
//			int [] arr = new int[4] ;
//			System.out.println(arr[6]);
//		}
//		catch(ArrayIndexOutOfBoundsException e1) {
//			System.out.println(e1);
//     	}
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
		
		
		
		
		
	}

}
