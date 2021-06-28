package com.study.java8.functionalInterface;

import java.util.function.IntToDoubleFunction;

/**
 * @author rajan
 * 
 * Int to double function demo -26Jun2021
 *
 */
public class IntTodoubleFuctionDemo {

	public static void main(String args[]) {
		IntToDoubleFunction int2D=x->3.4*x;
		System.out.print(int2D.applyAsDouble(2));
	}
}
