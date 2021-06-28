package com.study.java8.functionalInterface;

import java.util.function.Supplier;

/**
 * @author rajan
 * 
 * Supplier demo -27Jun2021
 *
 */
public class SupplierDemo {
	
	public static void main(String args[]) {
		Supplier<String> sup=()->"Hellow";
		System.out.println(sup.get());
	}

}
