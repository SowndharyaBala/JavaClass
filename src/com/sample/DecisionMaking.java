package com.sample;

import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your age");
		
		int age = scan.nextInt();
		
//		if(age >= 98) {
//			System.out.println("Eligible for voting");
//		}else {
//			System.out.println("not eligible for voting");
//		}
		
//		if(age <=1) {
//			System.out.println("infant");
//		}else if(age >1 && age <=10) {
//			System.out.println("child");
//		}else if (age >10 && age <20) {
//			System.out.println("teenage");
//		
//		}else if(age >=20 && age <60) {
//			System.out.println("adult");
//		}else {
//			System.out.println("senior");
//		}
		
		
		if(age >=18) {
			System.out.println("eligible for voting");
			if(age >=18 && age<50) {
				System.out.println("not senior");
			}else {
				System.out.println("senior");
			}
			
		}else {
			System.out.println("not vote");
		}

	}

}
