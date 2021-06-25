package com.study.java8.functionalInterface;

import java.util.function.Function;

/**
 * @author rajan
 * 
 * Function<T,R> - 23Jun2021
 *
 */
public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, Double> divide=x->x/2.0;
		System.out.println(divide.apply(10));
		System.out.println(divide.andThen(a->a*2.0).apply(60));
		divide=divide.compose(x->x*10);
		System.out.println(divide.apply(60));
		
		Function i= Function.identity();//return its on argument
		System.out.println(i);
		
	}
}
