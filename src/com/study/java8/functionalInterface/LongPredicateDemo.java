package com.study.java8.functionalInterface;

import java.util.function.LongPredicate;

/**
 * @author rajan
 * 
 * LongPredicate -27Jun2021
 *
 */
public class LongPredicateDemo {
	
	public static void main(String args[]) {
		LongPredicate op1=x->{
			if(x>5)
				return true;
			return false;
		};
		System.out.println(op1.test(4));
		
		LongPredicate op2=op1.negate();
		System.out.println(op2.test(4));
		
		LongPredicate op3=op1.and(op2);
		System.out.println(op3.test(4));
		
		LongPredicate op4=op1.or(op2);
		System.out.println(op4.test(4));
		
	}

}
