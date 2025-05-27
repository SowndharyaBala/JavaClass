package abstraction;

interface Parent{
	
	void money();
}

interface Child extends Parent{
	
	void study();
}

class Grandchild implements Child{
	
	public void money() {
		System.out.println("spending money");
	}
	
	public void study() {
		System.out.println("studying");
	}
	
}

public class Exte_pare {

	public static void main(String[] args) {
	
		Grandchild gc = new Grandchild();
		gc.money();
		gc.study();

	}

}
