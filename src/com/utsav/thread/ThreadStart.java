package com.utsav.thread;

public class ThreadStart implements Runnable{

	public static void main(String[] args) {
		ThreadStart threadStart = new ThreadStart();
		Thread t1 = new Thread(threadStart);
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("Thread is running..");
	}

}
