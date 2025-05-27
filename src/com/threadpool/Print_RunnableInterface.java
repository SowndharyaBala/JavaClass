package com.threadpool;

class MyRunnable implements Runnable{
	public void run() {
		for(int i= 10; i>=0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class Print_RunnableInterface {

	public static void main(String[] args) {
		
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
