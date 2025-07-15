package com.multithreading;

class MyThreads implements Runnable{
	
	public void run() {
		
		for(int i = 1; i <5 ; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
		int a = 10; int b = 0;
		
		
		if(b==0) {
			throw new ArithmeticException("not divide by zero");
		}
		
		int c= a/b;
		System.out.println(c);
		
	
	}
	
}

public class Runable_Interface {
	

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyThreads());
		t1.start();
		
		Thread t2 = new Thread(new MyThreads());
		t2.start();
	}

}
