package com.study.java8.functionalInterface;

import java.util.function.IntFunction;

/**
 * @author rajan
 * 
 * IntFunction<R> - demo 24Jun2021
 *
 */
public class IntFunctionDemo {
	public static void main(String ...args) {
		IntFunction<Double> intF=x->x/2.0;
		System.out.println(intF.apply(900));
	}

}
