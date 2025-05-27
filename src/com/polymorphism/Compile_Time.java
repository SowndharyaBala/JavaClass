package com.polymorphism;

class operation{

	static int multiply(int a, int b) {
		return a*b;
	}

	static int multiply(int a, int b, int c ) {
		return a*b*c;
	}

}

public class Compile_Time {

	public static void main(String[] args) {

		System.out.println(operation.multiply(2, 3));
		System.out.println(operation.multiply(2, 3, 2));

	}

}
