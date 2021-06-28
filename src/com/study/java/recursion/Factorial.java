package com.study.java.recursion;

/**
 * @author rajan
 * 
 * Factorial using recurion 25Jun2021
 *
 */
public class Factorial {
	
	public static void main(String args[]) {
		System.out.println(new FactorialDemo().factorials(6));
		
	}

}
/**
 * @author rajan
 * 25Jun2021
 *
 */
class FactorialDemo{
	int factorials(int num) {
		if(num==0) {
			return 0;
		}
		if(num==1) 
			return 1;
		return num*factorials(num-1);
	}
}
