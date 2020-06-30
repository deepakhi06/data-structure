package com.utsav.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(3);
		Thread first = new Thread(new ServiceThread("Service 1", 1000, cb));
		Thread second = new Thread(new ServiceThread("Service 2", 1000, cb));
		Thread third = new Thread(new ServiceThread("Service 3", 1000, cb));
		
		first.start();
		second.start();
		third.start();
		System.out.println(Thread.currentThread().getName() + " thread has been finished..");
	}
}
class ServiceThread implements Runnable{
	CyclicBarrier cb;
	String name;
	int timeToWait;
	public ServiceThread(String name, int timeToWait, CyclicBarrier cb) {
		this.name = name;
		this.timeToWait = timeToWait;
		this.cb = cb;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(timeToWait);
			System.out.println(Thread.currentThread().getName() + "is calling await..");
			cb.await();
			System.out.println(Thread.currentThread().getName() + " has started running again");
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
