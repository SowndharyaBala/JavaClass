package com.poly;

class Animal{
	
	void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal{
	
	@Override
	void eat() {
		System.out.println("eating bone");
	}
}

public class Run_Time {

	public static void main(String[] args) {
		
//		Animal a = new Animal();
//		a.eat();
		
//		Dog d = new Dog();
//		d.eat();
		
		Animal a;
		a = new Dog();
		a.eat();

	}

}
