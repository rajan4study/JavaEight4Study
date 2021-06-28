package com.study.java8.functionalInterface;

import java.util.function.LongFunction;

/**
 * @author rajan
 * 
 * LongFunction<R> demo 27Jun2021
 *
 */
public class LongFunctionDemo {
	
	public static void main(String s[]) {
		LongFunction<String> op1=x->{
			return "rajan"+x;
		};
		System.out.println(op1.apply(10000000));
	}

}
