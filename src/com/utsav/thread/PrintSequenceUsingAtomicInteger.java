package com.utsav.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintSequenceUsingAtomicInteger {

	AtomicInteger sharedResult = new AtomicInteger(0);
	Object object = new Object();
	public static void main(String[] args) {
		PrintSequenceUsingAtomicInteger ps = new PrintSequenceUsingAtomicInteger();
		ThreadTask task1 = ps.new ThreadTask(0);
		ThreadTask task2 = ps.new ThreadTask(1);
		ThreadTask task3 = ps.new ThreadTask(2);
		
		new Thread(task1).start();
		new Thread(task2).start();
		new Thread(task3).start();
	}
	private class ThreadTask implements Runnable{
		private final int position; 
		public ThreadTask(int position){
			this.position = position;
		}
		@Override
		public void run() {
			while(sharedResult.get() < 10){
				synchronized (object) {
					if(sharedResult.get() % 3 == position){
						if(sharedResult.get() < 10){
							System.out.println(position + ":" + sharedResult.incrementAndGet());
						}
					}
				}
			}
		}
		
	}
}
