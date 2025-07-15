package com.inheritance;

public class Example {

	public static void main(String[] args) {
		Schol s = new Schol("Abc", "Vignesh", 60);
		s.display();
	}

}

class Students{
	int rollNo;
	String name;
	 
	public Students(int r, String n) {
		this.rollNo = r;
		this.name = n;	
		
		
	}
	
	public void details() {
		System.out.println(rollNo + " " + name);
	}
}

class Schol{
	String schName;
	Students student;
	
	public Schol(String schName, String studentName, int rollNo) {
		this.schName = schName;
		this.student =  new Students(rollNo , studentName);
	}
	
	void display() {
		System.out.println("School : " + schName);
		student.details();
	}
}
