package com.study.java8.functionalInterface;

import java.util.function.IntConsumer;

/**
 * @author rajan
 * 
 * IntConsumer demo -24Jun2021
 *
 */
public class IntConsumerDemo {
	
	public static void main(String args[]) {
		IntConsumer ic1=x->System.out.println(x);
		ic1.accept(10);
		IntConsumer ic2=x->System.out.println(x*10);
		ic2.andThen(ic1).accept(10);
	}

}
