package com.study.java8.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

/**
 * @author rajan
 * 
 * ToDoubleBiFunction<T,U> - return double
 * ToDoubleFunction<T> -return double
 * ToIntBiFunction<T,U> -return int
 * ToIntFunction<T> -return int
 * ToLongBiFunction<T,U> -return long
 * ToLongFunction<T> -return long
 * 
 * @since 27Jun2021
 *
 */
public class ToTypeXFunctionDemo {
	
	public static void main(String args[]) {
		ToDoubleBiFunction<Integer, String> op1=(x,str)->{
			System.out.println(x+str);
			return 10.2;
		};
		
		System.out.println(op1.applyAsDouble(4, "study"));
		ToDoubleFunction<List<Integer>> op2=list->{
			
			list.forEach(x->{System.out.println(x*10);
			});
			return 0.0;
		};
		
		List<Integer>list=Arrays.asList(1,2);
		System.out.println(op2.applyAsDouble(list));
		
		ToIntBiFunction<Integer, Integer> op3=(x,y)->x*y;
		System.out.println(op3.applyAsInt(2, 2));
		
		ToIntFunction<String> op4=str->1000;
		System.out.println(op4.applyAsInt("rjan"));
		
		ToLongBiFunction<Integer, Integer> op5=(x,y)->{
			return (long)(x*y);
		};
		System.out.println(op5.applyAsLong(2, 4512));
		
		ToLongFunction<String>op6=str->1000000000;
		System.out.println(op6.applyAsLong("rjan"));
	}

}
