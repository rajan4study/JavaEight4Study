package com.study.java8.functionalInterface;

import java.util.function.IntToLongFunction;

/**
 * @author rajan
 * IntToLong function demo -26Jun2021
 *
 */
public class Int2Long {

	public static void main(String args[]) {
		IntToLongFunction int2Long=x->x*1000000000;
		System.out.println(int2Long.applyAsLong(2));
	}
}
