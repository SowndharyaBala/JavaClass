package com.multithreading;

class Print extends Thread{
	public void run() {
		for(int i = 1; i<4; i++) {
			System.out.println("Numbers : " + i);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Example {

	public static void main(String[] args) {
		Print p = new Print();
		System.out.println("Before starting " + p.getState());
		p.start();
		System.out.println("After starting " + p.getState());
		try {
			p.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("State after thread completes " + p.getState());
		
	}

}
