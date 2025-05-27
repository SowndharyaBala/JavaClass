package abstraction;

interface Furniture{
	
	public String colour = "wooden colour";
	void table();
	
	static void material(){
		System.out.println("furniture is made of wood");
	}
	
	default void size() {
		System.out.println("the size vary");
	}
}

class Chair implements Furniture{
	
	public void table() {
		System.out.println("table");
	}
	
	 static void material() {
		System.out.println("furniture is made of steel");
	}
	 
	 void sofa() {
		 System.out.println("sofa");
	 }
	 
	 public void colour() {
		 System.out.println("the colour of the furniture is " + " " +colour );
	 }
	 
	 
}

public class Def_Sta_Meth_Interface {

	public static void main(String[] args) {
		
		Chair F = new Chair();
		F.table();
		Furniture.material();
		Chair.material();
		F.sofa();
        F.colour();
	}

}
