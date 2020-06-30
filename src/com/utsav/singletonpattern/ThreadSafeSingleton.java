package com.utsav.singletonpattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class ThreadSafeSingleton implements Serializable{

	private static final long serialVersionUID = -8846497708407501639L;
	private static volatile ThreadSafeSingleton instance = null;
	
	private ThreadSafeSingleton(){}
	
	public void test(){
		System.out.println("Thread safe instance created.");
	}
	
	//Added to avoid more than 1 object because of implementing Seriazibale
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
	
	public static synchronized ThreadSafeSingleton getInstance(){
		if(instance == null){
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	private int i = 10;
	
    public int getI() {
        return i;
    }
 
    public void setI(int i) {
        this.i = i;
    }
}

