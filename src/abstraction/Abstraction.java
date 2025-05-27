package abstraction;

abstract class Car{
	
	abstract void start();
	
}

class Bmw extends Car{
	
	void start() {
		System.out.println("starting");
	}
}

class Hondo extends Car{
	
	void start() {
		System.out.println("starts");
	}
	
	void wheels() {
		System.out.println("4 wheels");
	}
}

//class Rat extends Animal{
//	
//	void eat() {
//		System.out.println("eating");
//	}
//}

public class Abstraction {

	public static void main(String[] args) {
		
		Car a = new Bmw();
		a.start();
		
		Car car = new Hondo();
		car.start();
		
		Hondo c = new Hondo();
		c.start();
		c.wheels();
		

	}

}
