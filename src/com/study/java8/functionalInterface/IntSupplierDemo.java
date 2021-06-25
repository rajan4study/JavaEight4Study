package com.study.java8.functionalInterface;

import java.util.function.IntSupplier;

/**
 * @author rajan
 * 
 * Intsupplier demo -25jun2021
 *
 */
public class IntSupplierDemo {

	public static void main(String...args) {
		IntSupplier intsub=()->(int)(Math.random()*100);
		System.out.println(intsub.getAsInt());
	}
}
