package com.study.java8.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

/**
 * @author rajan
 * 
 * Demo for ObjDoubleConsumer,ObjLongConsumer,ObjIntConsumer -27Jun2021
 *
 */
public class ObjectConsumerDemo {
	
	public static void main(String args[]) {
		List<Integer> list=Arrays.asList(3,5,6,7,8);
		List<String> listStr=Arrays.asList("rajan ","is ","developer.");
		
		ObjDoubleConsumer<List<Integer>> op1=(listX,num)->{
			listX.stream().forEach(x->System.out.println(x*num));
		};
		
		op1.accept(list, 100);
		
		ObjIntConsumer<List<String>> op2=(listX,num)->{
			listX.forEach(x->System.out.print(num+x));
		};
		
		op2.accept(listStr, 100);
		System.out.println();
		
		ObjLongConsumer<List<Double>> op3=(listX,num)->{
			listX.forEach(x->System.out.println(x*num));
		};
		List<Double> listD=Arrays.asList(1.0,2.0,6.3,7.9);
		op3.accept(listD, 1000000000);
	}

}
