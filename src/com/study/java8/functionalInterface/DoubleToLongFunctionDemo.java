package com.study.java8.functionalInterface;

import java.util.function.DoubleToLongFunction;

/**
 * @author rajan4study
 * Demo for DoubleTolongFunction in java
 *
 */
public class DoubleToLongFunctionDemo {
	
	public static void main(String...args) {
		DoubleToLongFunction doubleToLongFun=a->(long)a;
		System.out.println(doubleToLongFun.applyAsLong(5.654));
	}

}
