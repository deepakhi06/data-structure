package com.utsav.proxypattern;

public class ProxyDemo {

	public static void main(String[] args) {
		
		Proxy proxy = new Proxy();

		FastExecution fastExecution = new FastExecution();
		fastExecution.sayHello();

		proxy.sayHello();
	}

}
