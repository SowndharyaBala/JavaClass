package com.practice;


class Parent{
	
	void business() {
		System.out.println("doing business");
	}
	
}

class Child extends Parent{
	 void course() {
		 System.out.println("Studying course");
	 }
}

class grandchild extends Parent{
	void child() {
		System.out.println("grandchildren");
	}
}

class Child1 extends Child{
	void eat() {
		System.out.println("eating");
	}
}

public class Inheritance {
	
	public static void main(String[] args) {
		Child ch = new Child();
		ch.business();
		ch.course();
		
		grandchild g = new grandchild();
		g.business();
		g.child();
		
		Child1 c1 = new Child1();
		c1.eat();
		c1.business();
		c1.course();
	}

}
