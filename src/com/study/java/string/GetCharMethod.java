package com.study.java.string;

/**
 * @author rajan
 *
 */
/**
 * @author rajan
 *
 */
public class GetCharMethod {
	public static void main(String args[]) {
		String str="Ich heise Rajan.";
		char[] charStr=new char[10];
		str.getChars(0,10,charStr,1);
		System.out.println(charStr);
	}

}
