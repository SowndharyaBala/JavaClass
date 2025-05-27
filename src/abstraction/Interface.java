package abstraction;

interface Animal{
	void sound();
}

class Dog implements Animal{
	
	public void sound() {
		System.out.println("barking");
	}
}




public class Interface {

	public static void main(String[] args) {
		
		Animal myDog = new Dog();
		myDog.sound();

	}

}
