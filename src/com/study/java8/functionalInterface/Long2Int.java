package com.study.java8.functionalInterface;

import java.util.function.LongToIntFunction;

/**
 * @author rajan
 * 
 * LongToInt demo 27Jun2021
 *
 */
public class Long2Int {
	
	public static void main(String args[]) {
		LongToIntFunction op1=x->(int)x/3;
		System.out.println(op1.applyAsInt(4502356));
	}

}