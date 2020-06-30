package com.utsav;


public class GenericsDemo<T> implements DemoInterface<String, Integer>{
	
	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t){
		this.t = t;
	}
	
	public Integer doSomeOperation(String t)
	   {
			return 1;
	   }
	public String doReverseOperation(Integer t)
	   {
		   return "generics";
	   }
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		GenericsDemo<String> gd = new GenericsDemo<>();
		gd.set("Aatif");
		
		@SuppressWarnings("rawtypes")
		GenericsDemo gdRaw = new GenericsDemo();
		gdRaw.set("Aatif Hasan");
		gdRaw.set(5); //valid
		
		int ops = gdRaw.doSomeOperation("");
		System.out.println(ops);
		String revOps = gd.doReverseOperation(1);
		System.out.println(revOps);
		
		System.out.println(gdRaw.get());
		System.out.println(gd.get());
		
		Object[] array = new String[10];
		array[0] = "Aatif";
		array[1] = 10;
	}
}
//Generic interface definition
interface DemoInterface<T1, T2>
{
 T2 doSomeOperation(T1 t);
 T1 doReverseOperation(T2 t);
}

