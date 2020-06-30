package com.utsav.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExecutor {

	public static void main(String[] args) {
		// Step1 : Create a Runnable
		Callable<String> callableTask = new CallableTask();
		// Step 2: Configure Executor
		// Uses FixedThreadPool executor
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Future<String> future = executor.submit(callableTask);
		boolean listen = true;
		while (listen) {
			if (future.isDone()) {
				String result;
				try {
					result = future.get();
					listen = false;
					System.out.println(result);
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
			}
		}
	   executor.shutdown();
	}
}

class CallableTask implements Callable<String>{

	@Override
	public String call() throws Exception {
		String s = "Callable Task Run at " + System.currentTimeMillis();
		return s;
	}
}