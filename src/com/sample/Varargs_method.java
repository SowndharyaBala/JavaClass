package com.sample;

public class Varargs_method {
	
	public static void fun(String s ,int...n) {
		
		System.out.println("String " + s);
		System.out.println("No of arguements " + n.length);
		for(int i : n) {
			System.out.print( i + " ");
		}
		System.out.println();
	}

	public static void main(String []args) {
		fun("Sowndharya " ,1, 2, 3);
		fun("Vignesh " , 7);
	}
}
