package com.utsav.singletonpattern;

public class SingletonMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		LazySingleton instance1 = LazySingleton.getInstance();
		instance1.demoMethod();
		
		EagerSingleton instance2 = EagerSingleton.getInstance();
		instance2.test();
		
		ThreadSafeSingleton instance3 = ThreadSafeSingleton.getInstance();
		instance3.test();
		
		DoubleCheckLockingSingleton instance4 = DoubleCheckLockingSingleton.getInstance();
		instance4.test();
		
		BillPughSingleton instance5 = BillPughSingleton.getInstance();
		instance5.test();
	   }
}
