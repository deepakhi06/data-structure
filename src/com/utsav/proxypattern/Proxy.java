package com.utsav.proxypattern;

import java.util.Date;

public class Proxy {
	
	SlowExecution slowExecution;

	public Proxy() {
		System.out.println("Creating proxy at " + new Date());
	}

	public void sayHello() {
		if (slowExecution == null) {
			slowExecution = new SlowExecution();
		}
		slowExecution.sayHello();
	}
}
