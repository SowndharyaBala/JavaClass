package com.practice;

public class Binary {
	public static void main(String[] args) {
//		byte a = 7;
//		byte b = 4;
//	byte c = a  & b;
//		System.out.println("a & b : " + c);
		
		//before operation it is converted to int and later only perform operations, so result has to be in int variable
		
//		byte a = 4;
//		byte b = 7;
//		int result = a & b;
//		System.out.println( a & b);
//		System.out.println("a & b : " + (a & b));
//		System.out.println(result);
//		
//		int result1 = a | b;
//		System.out.println( result1);
//		System.out.println( a|b);
//		
//		int result2 = ~b;
//		System.out.println( ~b);
//		System.out.println( result2);
//		
//		
//		System.out.println( a ^ b);
//		int result3 = a^b;
//		System.out.println( result3);
//		
//		System.out.println( a << 2);
//		int result4 = a<<2;
//		System.out.println( result4);
//		
//		System.out.println( a >> 2);
//		int result5 = a >> 2;
//		System.out.println( result5);
//
//		
//		short c = 7;
//		short d = 4;
//		System.out.println( c & d);
//		short ans = (short) (a|b);
//		System.out.println(ans);
//		
//		
//		long e = 7;
//		long f = 4;
//		long g = e&f;
//		System.out.println(g);
		
//		int y = 32;
//		System.out.println(y >>> 2);
		
//		int a = 5;
//		System.out.println("A <<1 : " +(a<<1));
		
		  int a = 5;  //0101
	        int b = 6;  //0110
	 
	        System.out.println("A & B :" + (a & b));
	        System.out.println("A | B:" + (a | b));
	        System.out.println("A ^ B:" + (a ^ b));
	        System.out.println("~ A:" + (~a));
//	        System.out.println("A << 1 "+ (byte)(a <<1));
	        System.out.println("A << 1" + " " + (a << 1));
	        System.out.println("A << 1 " + (a << 1));
	        System.out.println("A >> 1 " + (a >> 1));
	        System.out.println("A >>> 1 " + (a >>> 1));

		

	}

}
