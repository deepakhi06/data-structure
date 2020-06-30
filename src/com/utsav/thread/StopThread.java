package com.utsav.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

class StopThread extends Thread {
 
	volatile boolean bExit = false;

	public void exit(boolean bExit) {
		this.bExit = bExit;
	}

	@Override
	public void run() {
		while (!bExit) {
			System.out.println("Thread is running");
		}
	}
	
	public static void main(String[] args) {
		StopThread stopThread = new StopThread();
		stopThread.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException ex) {
			Logger.getLogger(StopThread.class.getName()).log(
					Level.SEVERE, null, ex);
		}
		stopThread.exit(true);
	}
}
