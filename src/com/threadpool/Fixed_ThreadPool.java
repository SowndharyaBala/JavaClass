package com.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fixed_ThreadPool {

	public static void main(String[]args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for(int i =1; i<=5; i++) {
			final int taskId = i;
			
			executor.execute(()->{
				System.out.println("Task " + taskId + "executed by " + Thread.currentThread().getName());
			});
		}
		
		executor.shutdown();
	}
}
