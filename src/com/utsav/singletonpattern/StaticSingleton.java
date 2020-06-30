package com.utsav.singletonpattern;

public class StaticSingleton {
	private static StaticSingleton instance;
	static{
		instance = new StaticSingleton();
	}
	
	private StaticSingleton(){
	}
	
	public static StaticSingleton getInstance(){
		return instance;
	}
	
	public void test(){
		System.out.println("It's working.!!");
	}
	
	public static void main(String[] args) {
		StaticSingleton myInstance = getInstance();
		myInstance.test();
	}

}
