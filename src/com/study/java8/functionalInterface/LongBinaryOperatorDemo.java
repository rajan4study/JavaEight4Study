package com.study.java8.functionalInterface;

import java.util.function.LongBinaryOperator;

/**
 * @author rajan
 * 
 * LongBinaryOperator demo 27Jun2021
 *
 */
public class LongBinaryOperatorDemo {
	
	public static void main(String...args) {
		LongBinaryOperator op1=(x,y)->{
			return x*y*100;
		};
		System.out.println(op1.applyAsLong(7000, 10));
	}

}
