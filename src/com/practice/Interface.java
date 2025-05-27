package com.practice;

interface Library{
	
	public int sides = 4;
	
	 void books();
	 
	 
	 static void arrangement() {
		 System.out.println("arranged");
	 }
	 
	 default void table() {
		 System.out.println("table");
	 }
	 
}

interface A{
	 void show();
	
}
class Section implements Library , A{
	public void books() {
		System.out.println("books");
	}
	
	public void table() {
		System.out.println("no tables");
	}
	
	public void arrangement() {
		System.out.println("arranging");
	}
	
	public void manager() {
		System.out.println("no manager");
	}
	
	public void sides() {
		System.out.println("Table has " + sides + "sides");
	}
	
	public void show() {
		System.out.println("show");
	}
}

public class Interface {

	public static void main(String[] args) {
		Library L = new Section();
		L.books();
		L.table();
		Library.arrangement();
	
		
//		Section L = new Section();
//		L.books();
//		L.table();
//		L.manager();
//		L.arrangement();
//		L.show();
//		L.sides();
		
		
	}

}
