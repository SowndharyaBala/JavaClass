package com.sample;

public class SwitchEx {

	public static void main(String[] args) {
		int days = 8;
		
		switch(days) {
		case 1 :
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
			
		case 4,8,9,25,18:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
			default:
				System.out.println("invalid day");
		}

	}

}
