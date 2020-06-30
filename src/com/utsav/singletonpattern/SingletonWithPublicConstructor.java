package com.utsav.singletonpattern;

public class SingletonWithPublicConstructor {


	private static SingletonWithPublicConstructor instance;
	
	public static synchronized SingletonWithPublicConstructor getInstance() {
		return (instance != null) ? instance
				: new SingletonWithPublicConstructor();
	}

	public SingletonWithPublicConstructor() {
		System.out.println("in constructor");
		synchronized (SingletonWithPublicConstructor.class) {
			if (instance != null) {
				throw new IllegalStateException();
			}
			instance = this;
		}
	}
	
	public void testInstance(){
		System.out.println("Instance create..");
	}
	
	public static void main(String[] args) {
		SingletonWithPublicConstructor instance = SingletonWithPublicConstructor.getInstance();
		instance.testInstance();
	}

}
