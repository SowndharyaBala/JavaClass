package com.practice;

class Animal{
	 void sound() {
		 System.out.println("sound");
	 }
}

class Cat extends Animal{
	void sound() {
		System.out.println("meow");
	}
}

class Dog extends Animal{
	
	void sound() {
		System.out.println("bark");
	}
}
public class Overriding {

	public static void main(String[] args) {
		
		Animal a;
		a = new Cat();
		a.sound();

	}

}
