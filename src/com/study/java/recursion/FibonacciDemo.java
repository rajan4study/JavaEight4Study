package com.study.java.recursion;

/**
 * @author rajan
 * Fibonacci series using recursion 25Jun2021
 *
 */
public class FibonacciDemo {

	public static void main(String args[]) {
		System.out.print(Finonacci.n1+" "+ Finonacci.n2+" ");
		Finonacci.printFebi(8);
	}
	
}

class Finonacci{
	static int n1=0,n2=1,n3;
	static void printFebi(int num) {
		n3=n2+n1;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
		if(num>1) {
			printFebi(num-1);
		}
		
	}
}
