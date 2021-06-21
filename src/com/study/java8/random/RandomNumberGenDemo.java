package com.study.java8.random;

/**
 * @author rajan
 * 
 * Demo for random number generator- 21 june 2021
 *
 */
public class RandomNumberGenDemo {

	public static void main(String args[]) {
		//generate random numbers between 0 to 1
		//double value
		System.out.println(Math.random());
		//generate random numbers between 200 to 400
		//formula Math.random()*(max-min+1)+min
		System.out.println(Math.random()*(400-200)+200);
	}
}
