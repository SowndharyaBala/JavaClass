package com.multithreading;

public class InterruptHandling {
	 public static void main(String[] args) {  
	        Thread thread = new Thread(() -> {  
	            try {  
	                System.out.println("Thread will sleep for 5 seconds.");  
	                Thread.sleep(5000);  
	                System.out.println("Thread woke up after sleep.");  
	            } catch (InterruptedException e) {  
	                System.out.println("Thread was interrupted during sleep.");  
	            }  
	        });  
	        thread.start();  
	        try {  
	            Thread.sleep(2000); // Main thread sleeps for 2 seconds  
	            thread.interrupt(); // Interrupt the sleeping thread  
	        } catch (InterruptedException e) {  
	            e.printStackTrace();  
	        }  
	    }  


}
