package com.utsav.thread;

public class RaceCondition implements Runnable{

	private int count = 0;
	
	private void increment(){
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		count++;
	}
	
	private void decrement(){
		count--;
	}
	
	private int getCount(){
		return this.count;
	}
	@Override
	public void run(){
		synchronized (this) {
			this.increment();
			System.out.println(Thread.currentThread().getName() + " is incrementing: " + this.getCount());
			this.decrement();
			System.out.println(Thread.currentThread().getName() + " is decrementing: " + this.getCount());

		}
	}
	
	public static void main(String[] args) {
		RaceCondition race = new RaceCondition();
		Thread t1 = new Thread(race, "Thread-1");
		Thread t2 = new Thread(race, "Thread-1");
		Thread t3 = new Thread(race, "Thread-1");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
