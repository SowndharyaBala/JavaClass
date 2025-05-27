package com.threadpool;

class MyThread extends Thread{
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println("Print Numbers : " + i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class PrintNum {

	public static void main(String[] args) {
			MyThread t1 = new MyThread();
			t1.start();

	}

}
