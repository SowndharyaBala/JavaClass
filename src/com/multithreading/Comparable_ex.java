package com.multithreading;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	
	public String name;
	public int age,  rollNo;
	
	public Student(String n, int a, int r) {
		this.name	 = n;
		this.age = a;
		this.rollNo = r;
	}
	
	public int compareTo(Student sample) {
		return this.name.compareTo( sample.name);
	}
	public String toString() {
		return name;
	}
}
public class Comparable_ex {

	public static void main(String[] args) {
		ArrayList <Student> students = new ArrayList<>();
		
		students.add(new Student ("SOna" , 14, 34));

		students.add(new Student ("SOnu" , 14, 34));

		students.add(new Student ("SOnali" , 14, 34));
		
		Collections.sort(students);
		System.out.println(students);

	}
	
	static void print(ArrayList<Student>students) {
		for(Student s: students) {
			System.out.println(s.name);
		}
	}

}
