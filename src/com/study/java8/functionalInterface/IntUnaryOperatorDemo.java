package com.study.java8.functionalInterface;

import java.util.function.IntUnaryOperator;

/**
 * @author rajan
 *
 *IntUnaryOperator functional -27Jun2021
 *
 */
public class IntUnaryOperatorDemo {
	
	public static void main(String args[]) {
//		IntUnaryOperator intUO=IntUnaryOperator.identity();
//		System.out.println(intUO.applyAsInt(82));
		
		IntUnaryOperator intUO1=x->{
			x=x*10;
			System.out.println("hi");
			return x;
			};
//		System.out.println(intUO1.applyAsInt(82));
//		
//		IntUnaryOperator intUNO2=x->x/3;
//		System.out.println(intUO1.andThen(intUNO2).applyAsInt(82));
		
		
		IntUnaryOperator intUO4=x->x/0;
//		System.out.println(intUO4.andThen(intUO1).applyAsInt(82));
		System.out.println(intUO4.compose(intUO1).applyAsInt(82));
	}

}
