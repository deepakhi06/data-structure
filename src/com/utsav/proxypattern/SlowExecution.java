package com.utsav.proxypattern;

public class SlowExecution extends Execution{
	
	public SlowExecution() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
