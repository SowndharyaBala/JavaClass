package com.sample;

public class Method {
	
	//static String course = "java";
	
	private int num;
	private String name;
	
	
	

	public int getNum() {
		return num;
	}




	public void setNum(int num) {
		this.num = num;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public static void main(String[] args) {
		// System.out.println(Method.course);
		
		Method obj = new Method();
		Method obj1 = new Method();
		obj.setName("Ria");
		obj.setNum(23);
		
		obj1.setName("Sowndharya");
		obj1.setNum(26);
		
		
		System.out.println(obj.getName());
		System.out.println(obj.getNum());
		
		
		System.out.println(obj1.getName());
		System.out.println(obj1.getNum());
	}

}
