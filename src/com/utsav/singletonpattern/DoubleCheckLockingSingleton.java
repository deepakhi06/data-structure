package com.utsav.singletonpattern;

public class DoubleCheckLockingSingleton {
	
	private static volatile DoubleCheckLockingSingleton instance = null;
	
    private DoubleCheckLockingSingleton(){
    }
    
    public void test(){
    	System.out.println("Double check locking singleton.");
    }
    
    public static DoubleCheckLockingSingleton getInstance(){
    	if(instance == null){
    		synchronized (DoubleCheckLockingSingleton.class) {
				if(instance == null){
					instance = new DoubleCheckLockingSingleton();
				}
			}
    	}
		return instance;
    }
}
