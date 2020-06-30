package com.utsav.singletonpattern;

import java.io.Serializable;

public enum EnumSingleton implements Serializable{
	
	INSTANCE;
	  
	  /**Add some behavior to the object. */
	  public void distributePresents(){
	    System.out.println("Enum instance is created.");   
	  }
	  
	  public static void main(String... aArgs){
		EnumSingleton es = EnumSingleton.INSTANCE;
	    es.distributePresents();
	  }
}


