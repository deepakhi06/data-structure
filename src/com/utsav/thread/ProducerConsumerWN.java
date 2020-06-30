package com.utsav.thread;

import java.util.concurrent.CopyOnWriteArrayList;

public class ProducerConsumerWN {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> sharedQueue = new CopyOnWriteArrayList<Integer>();
		int size = 4;
		new Thread(new ProducerEnd(sharedQueue, size), "Producer").start();
		new Thread(new ConsumerEnd(sharedQueue, size), "Consumer").start();
	}
}

class ProducerEnd implements Runnable{
	
	private final CopyOnWriteArrayList<Integer> sharedQueue;
	private final int SIZE;
	
	ProducerEnd(CopyOnWriteArrayList<Integer> sharedQueue, int size){
		this.sharedQueue = sharedQueue;
		this.SIZE = size;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			try{
				System.out.println("Prodused: " + i);
				produce(i);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	private void produce(int i) throws InterruptedException {
		//wait if queue is full
		while(sharedQueue.size() == SIZE){
			synchronized (sharedQueue) {
				 System.out.println("Queue is full " + Thread.currentThread().getName()
                         + " is waiting , size: " + sharedQueue.size());
			sharedQueue.wait();
			}
		}
		//producing element and notify consumers
        synchronized (sharedQueue) {
            sharedQueue.add(i);
            sharedQueue.notify();
        }
	}
}

class ConsumerEnd implements Runnable{

	private final CopyOnWriteArrayList<Integer> sharedQueue;
	private final int SIZE;
	
	 public ConsumerEnd(CopyOnWriteArrayList<Integer> sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.SIZE = size;
	 }

	@Override
	public void run() {
		while(true){
			try{
				  System.out.println("Consumed: " + consume());
	              Thread.sleep(50);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	private int consume() throws InterruptedException {
		//wait if queue is empty
        while (sharedQueue.isEmpty()) {
            synchronized (sharedQueue) {
                System.out.println("Queue is empty " + Thread.currentThread().getName()
                                    + " is waiting , size: " + sharedQueue.size());

                sharedQueue.wait();
            }
        }
        //Otherwise consume element and notify waiting producer
        synchronized (sharedQueue) {
            sharedQueue.notify();
            return sharedQueue.remove(0);
        }
	}
}
