package com.jrd.java8features;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

public class FutureExample {

	public static void main(String[] args) 
	{
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<String> future = executorService.submit(() ->
		{
			Thread.sleep(10000);
			return "Completed";
		}
				);
		

			try {
				while(!future.isDone())
				{
					System.out.println("Task still in progress...");
					Thread.sleep(500);
				}
				System.out.println("completed.");
				String result = future.get(3000, TimeUnit.MILLISECONDS);
				System.out.println(result);
				
				executorService.shutdown();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}