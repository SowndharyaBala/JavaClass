package com.inheritance;

class Student{
	
	int rollno;
	String name;
	
	public Student(String name,int rollno) {
		this.name = name;
		this.rollno = rollno;
		
	}
	
	void displayStudent() {
		System.out.println("Roll no : " + rollno + " " + "Name : " + name);
	}
}

class School{
	
	String schname;
	Student student;
	
	public School(String schname, Student student) {
		this.schname = schname;
		this.student = student;
	}
	
	void displaySchool() {
		System.out.println("School Name : " + schname);
		student.displayStudent();
	}
}

public class Has_Inh {

	public static void main(String[] args) {
		
		Student s = new Student("sow",23);
		s.displayStudent();
		
		School sch = new School("abc",s);
		sch.displaySchool();
		
		
	}
}


