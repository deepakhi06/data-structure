package com.utsav;

public class PrintPyramid {

	public static void main(String[] args) {
		int num = 5;
		//getOneToFivePyramid(num);
		//getIsoTrianglePyramid(num);
		getFiveToOnePyramid(num);
	}
	
	private static void getOneToFivePyramid(int num){
		for(int i=0; i<num; i++){
			for (int j=0; j<=i; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
		}
	}
	
	private static void getFiveToOnePyramid(int num){
		 for(int i=num; i>0 ;i--){
             for(int j=0; j < i; j++){
                   System.out.print(j+1);
             }
             System.out.println();
		 }
	}
	
	private static void getIsoTrianglePyramid(int num){
	  for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}
