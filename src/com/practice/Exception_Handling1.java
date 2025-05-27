package com.practice;

import java.io.FileReader;
import java.io.IOException;

public class Exception_Handling1 {

	public static void main(String[] args) {
//		try {
//			String s = null;
//			System.out.println(s.toLowerCase());
//		}catch(NullPointerException e) {
//			System.out.println(e);
//		}
		
//		try {
//			int arr[] = new int[6];
//			
//			arr[8] = 78;
//			int a = 10/0;
//		}catch(ArithmeticException e) {
//			System.out.println(e);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}finally {
//			System.out.println("always executed");
//		}
		

		//checkAge(15);
		
		try {
			readFile();
		}catch(IOException e) {
			System.out.println(e);
		}

	}
	
//	public static void checkAge(int age) {
//		 if(age < 17) {
//			 throw new ArithmeticException("not eligible to vote");
//		 }else {
//			 System.out.println("eligible");
//		 }
//	}
	
	public static void readFile() throws IOException{
		FileReader fr = new FileReader("java.txt");
		fr.read();
		fr.close();
		
	}

}
