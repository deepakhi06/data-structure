package string;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class A {
	void m1() {
		System.out.println("In m1 A");
	}
}

class B extends A {
	void m1() {
		System.out.println("In m1 B");
	}

	void m2() {
		System.out.println("In m2 B");
	}
}

public class Test {

	public static void main(String[] args) {
		A a = new B();
		a.m1();
		Executor exe=Executors.newFixedThreadPool(5);
		
	
	}
}