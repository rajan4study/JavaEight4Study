package com.study.java8.functionalInterface;

import java.util.function.LongUnaryOperator;

/**
 * @author rajan
 * 
 * LongUnary operator  demo 27Jun2021
 *
 */
public class LongUnaryOperatorDemo {
	
	public static void main(String args[]) {
		LongUnaryOperator op1=x->x*10;
		System.out.println(op1.applyAsLong(2));
		
		LongUnaryOperator op2=x->x/2;
		System.out.println(op1.andThen(op2).applyAsLong(2));//excute op1 first and then op2
		System.out.println(op1.compose(op2).applyAsLong(2));//excute op2 first and then op1
	}

}