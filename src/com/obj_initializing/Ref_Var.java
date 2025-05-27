package com.obj_initializing;

public class Ref_Var {
	
	int book_no;
	String author;
	

	public static void main(String[] args) {
		
		Ref_Var book1 = new Ref_Var();
		book1.author = "William";
		book1.book_no = 01;
		System.out.println(book1.author + " " + book1.book_no);

	}

}
