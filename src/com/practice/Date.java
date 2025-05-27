package com.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		System.out.println("now " + now);
		
		LocalTime time = LocalTime.now();
		System.out.println("time " + time);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("datetime " + datetime);
		
		LocalDate customDate = LocalDate.of(2001,01,01);
		System.out.println(customDate);
		
		LocalTime customTime = LocalTime.of(15, 45, 23);
		System.out.println(customTime);

		LocalDateTime customDateTime = LocalDateTime.of(2021,12,23,15, 45, 23);
		System.out.println(customDateTime);

	}

}
