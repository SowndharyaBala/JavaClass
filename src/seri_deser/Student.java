package seri_deser;

import java.io.Serializable;

public class Student implements Serializable {
	
	int id; String name;
	public Student(int id, String n) {
		this.name = n;
		this.id = id;
	}

}
