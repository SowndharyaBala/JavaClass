package com.multithreading;

class Examples extends Thread{
	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("sleeping");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("started : " + Thread.currentThread().getName());
	}
	
	
}

public class Example3 {

	public static void main(String[] args) throws Exception {
		
		Examples t1= new Examples();
		Examples t2 = new Examples();
		
		System.out.println("Before start : " + t1.getState());
		System.out.println("Before start : " + t2.getState());
		
		
		
		t1.setPriority(10);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		
		t1.start();
		t2.start();
		
		Thread.sleep(1000);
		System.out.println("after start : " + t1.getState());
		
		System.out.println("after start : " + t2.getState());
		
	
	
		t1.join();
		System.out.println("after join : " + t1.getState());
		t2.join();
		System.out.println("after join : " + t2.getState());

	}

}
