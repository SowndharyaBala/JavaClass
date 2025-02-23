package com.practice;

import java.util.Scanner;

public class Control_IfElse {

	public static void main(String[] args) {
		 
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age");
		int age = s.nextInt();
		
		
//		if(age >=60) {
//			System.out.println("Senior");
//		}else {
//			System.out.println("Not");
//		}
		
		
		//if else ladder
//		if(age < 4) {
//			System.out.println("baby");
//		}else if(age >=4 && age <=19 ) {
//			System.out.println("teen");
//		}else if(age >20 && age <=59 ) {
//			System.out.println("adult");
//		}	else {
//			System.out.println("Senior");
//		}
		
		
		//nested if
		
//		if(age >=18) {
//			System.out.println("eligible voting");
//			if(age <50) {
//				System.out.println("not senior");
//			}else {
//				System.out.println("senior");
//			}
//		}else {
//			System.out.println("not vote");
//		}
		
		
		//switch
		 
		
		
		switch(age) {
		
		case 1 :
		System.out.println("Monday");
		break;
		
		case 2 :
			System.out.println("Tuesday");
			break;
			
		case 3 :
			System.out.println("Wednesday");
			break;
			
		case 4 :
			System.out.println("Thursday");
			break;
			
		case 5 :
			System.out.println("Friday");
			break;
			
		case 6 :
			System.out.println("Satday");
			break;
			
		case 7 :
			System.out.println("sunday");
			break;
		 default:
		        System.out.println("Invalid day");
		}

	}

}
