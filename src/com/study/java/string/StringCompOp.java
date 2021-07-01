package com.study.java.string;

/**
 * @author rajan
 * String compare oprations- ==.equals(),compareTo
 *
 */
public class StringCompOp {

	public static void main(String[] args) {
		String s1="rajan";
		s1.concat("m");
		String s2="rajan";
		System.out.println(s1);
		String s3= new String("rajan");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		String s4="abs";
		System.out.println(s4.compareTo(s1));
		
		

	}

}
