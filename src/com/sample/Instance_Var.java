package com.sample;

public class Instance_Var {
//	//without constructor
//	
//	int id;
//	String name;
//	
//	void display() {
//		System.out.println(id + name);
//	}
//
//	public static void main(String[] args) {
//		
//		Instance_Var obj = new Instance_Var();
//		obj.id = 1;
//		obj.name = "Java";
//		
//		obj.display();
//
//	}
//
	
	//with constructor =   duplicate line can be avoided, assigning values be easy
	
	String name;
	
	
	Instance_Var(String n){
		name = n;
	}		
		public static void main(String[] args) {
			Instance_Var obj = new Instance_Var("Anitha");
			
			System.out.println(obj.name);
			
		} 
	}
	



