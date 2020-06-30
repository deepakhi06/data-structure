package com.utsav.thread;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WorkerThread {

	public synchronized void work() throws IOException {
		String threadName = Thread.currentThread().getName();
		String fileName = threadName + ".txt";

		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(fileName));
			bw.write("Thread" + threadName + "write the message");
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
			try {
				wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(threadName + "is working");
		}

	}
	public static void main(String[] args) {
		WorkerThread worker =new WorkerThread();
		for(int i = 0;i<5;i++){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						worker.work();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}).start();
		}
	}
}
