package com.practice;

public class TypeCasting {

	public static void main(String[] args) {
		
		//System.out.println(add(7,8));
		
		int num = 45;
		double d= num;
		
		System.out.println(num + " num");
		System.out.println("double " + d);

		
		byte b = 7;
		float s = b;
		
		System.out.println("byte " + b);
		System.out.println("float " + s);
		
		
		float f = 50.78f;
		byte v = (byte)f;
		
		System.out.println(v);
		System.out.println(f);
		
 	}
	
//	public static int add(int a, int b) {
//		return a + b;
//	}

}
