package com.poly;

class DT_Com_time1{
	
	int add(int a, int b) {
		return a+b;
	}
	
	double add (double a , double b) {
		return a+b;
	}
}

public class DT_Com_time2 {

	public static void main(String[] args) {
		DT_Com_time1 o = new DT_Com_time1();
		System.out.println(o.add(7,8));
		System.out.println(o.add(10.2, 20.3));		

	}

}
