package com.study.java8.functionalInterface;

import java.util.function.IntBinaryOperator;

/**
 * @author rajan
 * IntBinaryOperator demo- it accept two int variable and produces int result- 23Jun2021
 *
 */
public class IntBinaryOperatorDemo {

	public static void main(String args[]) {
		IntBinaryOperator intBinaryOp=(x,y)->{
			int factX=1;
			for(int i=1;i<=x;i++) {
				factX*=i;
			}
			int factY=1;
			for(int i=1;i<=y;i++) {
				factY*=i;
			}
			return factX/factY;
		};
		
		System.out.println(intBinaryOp.applyAsInt(5, 2));
	}
}
