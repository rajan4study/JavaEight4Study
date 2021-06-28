package com.study.java8.functionalInterface;

import java.util.function.UnaryOperator;

/**
 * @author rajan
 * 
 * Demo for UnaryOperator<T> -return T
 * @since 26Jun2021
 *
 */
public class UnaryOperatorDemo {
	public static void main(String arg[]) {
		UnaryOperator<Double> op1=x->x*15.0;
		System.out.print(op1.apply(7.3));
	}

}
