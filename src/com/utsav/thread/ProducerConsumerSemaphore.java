package com.utsav.thread;

import java.util.concurrent.Semaphore;

public class ProducerConsumerSemaphore {

	public static void main(String[] args) {

		Semaphore semaphoreProducer = new Semaphore(1);
		Semaphore semaphoreConsumer = new Semaphore(0);
		System.out.println("semaphoreProducer permit=1 | semaphoreConsumer permit=0");

		ProducerClass producer = new ProducerClass(semaphoreProducer,semaphoreConsumer);
		ConsumerClass consumer = new ConsumerClass(semaphoreConsumer,semaphoreProducer);

		Thread producerThread = new Thread(producer, "ProducerThread");
		Thread consumerThread = new Thread(consumer, "ConsumerThread");

		producerThread.start();
		consumerThread.start();
	}
}

/**
 * Producer Class.
 */
class ProducerClass implements Runnable {

	Semaphore semaphoreProducer;
	Semaphore semaphoreConsumer;

	public ProducerClass(Semaphore semaphoreProducer, Semaphore semaphoreConsumer) {
		this.semaphoreProducer = semaphoreProducer;
		this.semaphoreConsumer = semaphoreConsumer;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				semaphoreProducer.acquire();
				System.out.println("Produced : " + i);
				semaphoreConsumer.release();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/**
 * Consumer Class.
 */
class ConsumerClass implements Runnable {

	Semaphore semaphoreConsumer;
	Semaphore semaphoreProducer;

	public ConsumerClass(Semaphore semaphoreConsumer,
			Semaphore semaphoreProducer) {
		this.semaphoreConsumer = semaphoreConsumer;
		this.semaphoreProducer = semaphoreProducer;
	}

	public void run() {

		for (int i = 1; i <= 5; i++) {
			try {
				semaphoreConsumer.acquire();
				System.out.println("Consumed : " + i);
				semaphoreProducer.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}