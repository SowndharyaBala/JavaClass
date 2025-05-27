package com.threadpool;

class ThreadA extends Thread{
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println("Print A");
		}
	}
}

class ThreadB extends Thread{
	public void run() {
		for(int i =1; i <=5; i++) {
			System.out.println("Print B");
		}
			
	}
}

public class MultipleThreads {

	public static void main(String[] args) {		// TODO Auto-generated method stub

		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		
		a.start();
		b.start();
	}

}
