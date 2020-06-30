package com.utsav.singletonpattern;

public class LazySingleton {
	 private static LazySingleton instance = null;
	   
	   /* A private Constructor prevents any other 
	    * class from instantiating.
	    */
	   private LazySingleton(){ }
	   
	   /* Static 'instance' method */
	   public static LazySingleton getInstance( ) {
		   if(instance == null) {
		         instance = new LazySingleton();
		      }
	      return instance;
	   }
	   /* Other methods protected by singleton-ness */
	   protected static void demoMethod( ) {
	      System.out.println("Demo Method for singleton."); 
	   }
}
