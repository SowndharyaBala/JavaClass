package com.inheritance;


class Food{
	 void energy() {
		 System.out.println("giving me an energy");
	 }
}

class Idly extends Food{
	
	void white() {
		System.out.println("it is white in color");
		
	}
}

class sambar extends Idly{
	
	void sidedish() {
		System.out.println("it an sidedish");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
		Food f = new Food();
		f.energy();
		
		Idly I = new Idly();
		I.energy();
		I.white();
		
		sambar s = new sambar();
		s.sidedish();
		s.white();
		s.energy();
	}

}

class Ebike extends Bike{
	public static void display() {
		System.out.println(name + " " + yr);
	}
}
