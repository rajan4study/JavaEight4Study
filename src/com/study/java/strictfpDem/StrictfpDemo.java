package com.study.java.strictfpDem;

/**
 * @author rajan
 * 
 * Strictfp -25Jun2021
 *
 */
public class StrictfpDemo {
	
	public static void main(String args[]) {
		StricFpClass.cal();
		
	}

}

 class StricFpClass{
	static strictfp void cal() {
		System.out.println(10.0/3);
	}
//	strictfp abstract StricFpClass1(){
//		
//	}
}
