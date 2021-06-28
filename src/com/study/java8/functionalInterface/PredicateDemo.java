package com.study.java8.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author rajan
 * 
 * Predicate demo -27Jun2021
 *
 */
public class PredicateDemo {
	
	public static void main(String args[]) {
		Predicate<List<Integer>> pred=list->{
			if(list.contains(10)) 
				return true;
			return false;
		};
		
		List<Integer>list= new ArrayList<>();
		list.add(11);
		if(pred.test(list)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
