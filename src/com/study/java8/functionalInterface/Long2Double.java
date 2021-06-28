package com.study.java8.functionalInterface;

import java.util.function.LongToDoubleFunction;

/**
 * @author rajan
 * 
 * LongToDouble demo 27Jun2021
 *
 */
public class Long2Double {
	
	public static void main(String args[]) {
		LongToDoubleFunction op1=x->{
			return .25;
		};
		System.out.println(op1.applyAsDouble(4502356));
	}

}
