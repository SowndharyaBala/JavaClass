package com.obj_initializing;

public class Constructor {
	int id_no;
	String name;
	
	Constructor(int id, String n){
		id_no = id;
		name = n;
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor(1, "java");
		Constructor obj1 = new Constructor(2, "javascript");
		
		System.out.println(obj.id_no + " " + obj.name);
		System.out.println(obj1.id_no + " " + obj.name);
	}

}
