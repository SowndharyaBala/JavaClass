package com.practice;


abstract class Vehicle{
	abstract void start();
}

class Car extends Vehicle{
	
	void start() {
		System.out.println("car started");
	}
}

class Bike extends Vehicle{
	void start() {
		System.out.println("bike started");
	}
	void wheel() {
		System.out.println("two wheels");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		
		Vehicle v = new Car();
		v.start();
		
		Vehicle Bike = new Bike();
		Bike.start();
	
		Bike b = new Bike();
		b.wheel();
		b.start();
	}

}
