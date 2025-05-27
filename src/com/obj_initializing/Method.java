package com.obj_initializing;

public class Method {

	int id_no;
	String name;
	
	public void insert(int id, String n) {
		this.id_no = id;
		this.name = n;
	}
	
	public void display() {
		System.out.println(id_no + " " + name);
	}
	
	public static void main(String[] args) {
		Method Student_s1 = new Method();
		Method Student_s2 = new Method();
		Student_s1.insert(1, "giri");
		
		Student_s2.insert(2, "Roja");
		
		Student_s1.display();
		Student_s2.display();

	}

}
