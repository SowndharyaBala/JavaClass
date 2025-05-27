package abstraction;

interface Cat{
	void sleep();
}

interface Bird{
	void eat();
}

 class Animals implements Cat,Bird{
	
	public void sleep(){
		System.out.println("sleeping");
		
	}
	
	public void eat(){
		System.out.println("eating");
	}
}

public class Mul_Inh {

	public static void main(String[] args) {
		
		Animals a = new Animals();
		a.eat();
		a.sleep();

	}

}
