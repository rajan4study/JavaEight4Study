package com.study.java.recursion;

/**
 * @author rajan
 * 
 * Sample infinite recursion program-25Jun2021
 *
 */
public class SampleDemo {

	public static void main(String...arrgs) {
		recusrion();// infinite call. Results stackoverflow error
	}

	private static void recusrion() {
		System.out.println("hello");
		recusrion();
		
	}
}
