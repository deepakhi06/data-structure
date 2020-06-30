package com.utsav;

public final class ImmutableClass {

	private int instanceOne;
	private String instanceTwo;
	
	private ImmutableClass(int instanceOne, String instanceTwo){
		this.instanceOne = instanceOne;
		this.instanceTwo = instanceTwo;
	}
	
	public static ImmutableClass getInstance(int instanceOne, String instanceTwo){
		return new ImmutableClass(instanceOne, instanceTwo);
	}
	public int getInstanceOne(){
		return instanceOne;
	}
	
	public String getInstanceTwo(){
		return instanceTwo;
	}
	
	@Override
    public String toString() {
        return instanceOne +" - "+ instanceTwo;
    }
	
	public static void main(String[] args) {
		
		ImmutableClass instance = ImmutableClass.getInstance(1, "Aatif");
		System.out.println(instance);
		tryModification(instance.instanceOne, instance.instanceTwo);
		System.out.println(instance);
	}
	
	 private static void tryModification(int fieldOne, String fieldTwo)
	    {
	        fieldOne = 10000;
	        fieldTwo = "test changed";
	    }
}
