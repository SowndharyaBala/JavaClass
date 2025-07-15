package com.multithreading;

class PrintAlpha implements Runnable{
	public void run() {
		for(char c = 'A' ; c <'D' ; c++) {
			System.out.println("Letters : " + c);
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Example2 {

	public static void main(String[] args) throws Exception{

		PrintAlpha alpha = new PrintAlpha();
		Thread t = new Thread(alpha);
		
		Thread t1 = new Thread(new PrintAlpha());
		
		System.out.println("before start : " + t.getState());
		System.out.println("before start : " + t1.getState());
		
		t.start();
		System.out.println("After start : " + t.getState());
		t1.start();
		System.out.println("After start : " + t1.getState());
		
		t.join();
		System.out.println("After join : " + t.getState());
		t1.join();
		System.out.println("After join : " + t1.getState());

	}

}
