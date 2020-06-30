package com.utsav.singletonpattern;

import java.io.Serializable;

public class Single implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private volatile static Single instance = null;
	
	private Single(){
		
	}
	
	public static Single getInstance(){
		if(instance == null){
			synchronized (Single.class) {
				if(instance == null){
					instance = new Single();
				}
			}
			
		}
		return instance;
	}
	
	public void test(){
		System.out.println("Instance created..");
	}

	public static void main(String[] args) {
		Single.getInstance().test();
	}

}
