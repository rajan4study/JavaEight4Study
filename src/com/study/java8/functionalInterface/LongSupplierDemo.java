package com.study.java8.functionalInterface;

import java.util.Random;
import java.util.function.LongSupplier;

/**
 * @author rajan
 * 
 * LongSupplier demo 27Jun2021
 *
 */
public class LongSupplierDemo {
	public static void main(String arg[]) {
		Random rd=new Random();
		
		LongSupplier op1=()->rd.nextLong();
		System.out.print(op1.getAsLong());
	}	

}
