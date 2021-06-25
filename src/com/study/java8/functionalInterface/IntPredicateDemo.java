package com.study.java8.functionalInterface;

import java.util.function.IntPredicate;

/**
 * @author rajan
 * 
 * IntPredicate-25Jun2021
 *
 */
public class IntPredicateDemo {
	
	public static void main(String...args) {
		IntPredicate intPredi1=x->{
			if(x>10)
				return true;
			return false;
		};
		System.out.println(intPredi1.test(9));
		IntPredicate intPredi2=x->{
			if(x<10)
				return true;
			return false;
		};
		System.out.println(intPredi2.test(9));
		IntPredicate intPredi3=intPredi1.and(intPredi2);
		System.out.println(intPredi3.test(9));
		IntPredicate intPredi4=intPredi1.or(intPredi2);
		System.out.println(intPredi4.test(9));
		IntPredicate intPredi5=intPredi1.negate();
		System.out.println(intPredi5.test(9));
	}

}
