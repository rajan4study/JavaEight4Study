package com.study.java8.functionalInterface;

import java.util.function.LongConsumer;

/**
 * @author rajan
 * 
 * LongConsumer demo- take one value and return nothing 27Jun2021
 *
 */
public class LongConsumerDemo {

	public static void main(String args[]) {
		LongConsumer op1=x->System.out.println(x);
		LongConsumer op2=x->{
			x=x*10;
		};
		
		op1.accept(3);
		op2.andThen(op1).accept(3);
	}
}
