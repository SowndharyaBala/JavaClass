package com.multithreading;

class Mythread extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + getState() + "count : " + i);
			
		try {
			sleep(200);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		}
		
	}
}

public class Thread_Class {

	public static void main(String[] args) {
		
		Mythread t1 = new Mythread();
		System.out.println("before state of the thread : " + t1.getState());
		t1.start();
		//t1.setPriority(5);
		System.out.println("after state of the thread : " + t1.getState());

		Mythread t2 = new Mythread();
		System.out.println("the state of the thread : " + Thread.currentThread().getState());
		t2.start();
		System.out.println("the state of the thread : " + Thread.currentThread().getState());
		t2.setPriority(2);

	}

}
