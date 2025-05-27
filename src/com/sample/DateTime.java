package com.sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {

	public static void main(String[] args) {
	
//		LocalDate today = LocalDate.now();
//		System.out.println(today);
//		
//		LocalTime now = LocalTime.now();
//		System.out.println(now);
//		
//		LocalDateTime java = LocalDateTime.now();
//		System.out.println(java);

		
		//Customedate
		
		LocalDate date = LocalDate.of(1996, 8, 10);
		System.out.println(date);
		
		LocalTime time = LocalTime.of(16, 10, 45);
		System.out.println(time);
	}

}
