package com.study.java.recursion;

/**
 * @author rajan
 * 
 * Finite recursion demo 25Jun2021
 *
 */
public class FinateRecursion {

	public static void main(String...args) {
		RecursionDem dem=new RecursionDem();
		dem.recursion();
	}

	
}
class RecursionDem{
	static int i=1;
	void recursion() {
		if(i<=10) {
			System.out.println(i++);
			recursion();
		}
	}
}
