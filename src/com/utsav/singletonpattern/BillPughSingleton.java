package com.utsav.singletonpattern;

import java.io.Serializable;

public class BillPughSingleton implements Serializable{
	
	private static final long serialVersionUID = -7604766932017737115L;
	
	private BillPughSingleton(){
	}
	
	/*Adding readResolve method prevents more than one object creation while deserialising 
	and avoids the Singleton feature break.*/
	protected Object readResolve() {
	    return getInstance();
	}
	public void test(){
		System.out.println("Bill Pugh singleton called.");
	}
	
	private static class SingletonHelper{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance(){
		return SingletonHelper.INSTANCE;
	}
}
