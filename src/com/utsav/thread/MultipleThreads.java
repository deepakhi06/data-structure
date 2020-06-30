package com.utsav.thread;

public class MultipleThreads {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread t1 = new Thread(myRunnable);
		Thread t2 = new Thread(myRunnable);
		t1.start();
		t1.setName("Aatif");
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//t2.start(); Causes IllegalThreadStateException, Threads can't be restarted.
	}
}
class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<50; i++){
			System.out.println("Runnable running " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
