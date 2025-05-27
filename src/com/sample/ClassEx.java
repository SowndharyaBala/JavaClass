package com.sample;

public class ClassEx {
	
	private String name;
	
	

	public String getName() {
		return name;
	}



	public void setName(String n) {
		this.name = n;
	}



	public static void main(String[] args) {
		ClassEx obj = new ClassEx();
		
		obj.setName("besant");
		System.out.println(obj.getName());
		

	}

}
