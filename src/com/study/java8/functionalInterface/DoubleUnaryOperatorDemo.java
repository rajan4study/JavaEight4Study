package com.study.java8.functionalInterface;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorDemo {
	
	public static void main(String[] args) {
		//accept and return double value
		DoubleUnaryOperator doubleUnaryOp=DoubleUnaryOperator.identity();
		System.out.println(doubleUnaryOp.applyAsDouble(7));
		
		//apply as double
		DoubleUnaryOperator op1=a->a*100;
		System.out.println(op1.applyAsDouble(7));
		
		//andThen- execute caller first and parameter last
		DoubleUnaryOperator op2=op1.andThen(a->a/2);
		System.out.println(op2.applyAsDouble(7));
		
		//compse -execute parameter first and caller last
		DoubleUnaryOperator op3=op1.compose(a->a/4);
		System.out.println(op3.applyAsDouble(7));
	}
}
