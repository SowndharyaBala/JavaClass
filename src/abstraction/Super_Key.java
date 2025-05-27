package abstraction;

class Clothes{
//	String colour = "black";
//	
//	void shop() {
//		System.out.println("shopping is done");
//	}
	Clothes(){
		System.out.println("clothing");
	}
	
}

class Towel extends Clothes{
	
	
	Towel(){
	super();
	System.out.println("towel cleaned");
	}
	
//	void tailor() {
//		System.out.println("tailoring");
//		super.shop();
//	}
//	
//	String colour = "red";
//	public void dress() {
//		System.out.println(colour);
//		System.out.println(super.colour);
//	}
	
}

public class Super_Key {

	public static void main(String[] args) {
		Towel T = new Towel();
		
		

	}

}
