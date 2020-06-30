package com.utsav.proxypattern;

import java.util.Date;

public abstract class Execution {
	
	public void sayHello() {
		System.out.println(this.getClass().getSimpleName() + " says howdy at " + new Date());
	}
}
