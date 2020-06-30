package com.utsav.singletonpattern;

public class EagerSingleton {
	private static EagerSingleton instance = new EagerSingleton();
	private EagerSingleton(){
	}
	
	public void test(){
		System.out.println("Instance created.");
	}
	public static EagerSingleton getInstance(){
		return instance;
	}
	
	public static void main(String[] args) {
		getInstance().test();
	}
}
