package com.multithreading;

class Counter{
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	private int count = 0;
	
	public void inc() {
		synchronized(this) {
			count++;
		}
	}
	
	
}

public class Syncronization {

	public static void main(String[] args) {
		
		Counter c = new Counter();
		
		Thread t1= new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
					c.inc();
				}
			}
		});
		
		Thread t2 =  new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
					c.inc();
				}
			}
		});
		
		 t1.start();
	        t2.start();

	        try {
	        	t1.join();
	        	t2.join();
	        }catch(Exception e){
	        	e.printStackTrace();
	        }
	        
	        System.out.println("Final count: " + c.getCount());

	}

}
