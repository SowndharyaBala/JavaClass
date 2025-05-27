package com.sample;

public class TypeCasting {

	public static void main(String[] args) {
		
		//widening - implicit
		
//		int i = 78;
//		double d = i;
//		
//		System.out.println("the value of int : " + i );
//		System.out.println("the value of double : " + d );
		
		//narrowing - explicit
		
		double d = 73.90;
		byte b = (byte)d;
		
		System.out.println("the value of d : " + d);
		System.out.println("the value of b : " + b);
	}

}
