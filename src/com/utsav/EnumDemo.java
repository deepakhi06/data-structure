package com.utsav;

public class EnumDemo {

	private MyEnum cName;
	
	public EnumDemo(MyEnum cName){
		this.cName = cName;
	}
	
	public static void main(String[] args) {
		
		for (MyEnum cName : MyEnum.values()) {
			System.out.println("Company Value1: " + cName.getValue1() + " - Company Value2: " + cName.getValue2() + " - Company Name: " + cName);
		}
		/*MyEnum cName = MyEnum.GOOGLE;
		cName = 1;   // Compilation Error
		*/
		EnumDemo enumDemo = new EnumDemo(MyEnum.EBAY);
		enumDemo.getCompanyDetails();
	}
	
	public void getCompanyDetails(){
		switch (cName) {
		case EBAY:
			System.out.println("Biggest Market Place in the World.");
			break;
 
		case PAYPAL:
			System.out.println("Simplest way to manage Money.");
			break;
 
		case GOOGLE:
		case YAHOO:
			System.out.println("1st Web 2.0 Company.");
			break;
 
		default:
			System.out.println("Google - biggest search giant.. ATT - my carrier provider..");
			break;
		}
	}
}
enum MyEnum{
	GOOGLE(1), YAHOO(2), AMAZON(3,4), PAYPAL(5,6), EBAY(7,8);
	
	private int value1;
	private int value2;
	
	private MyEnum(int value1){
		this.value1 = value1;
	}
	//Overloaded constructor
	private MyEnum(int value1, int value2){
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public int getValue1(){
		return value1;
	}
	
	public int getValue2(){
		return value2;
	}
}