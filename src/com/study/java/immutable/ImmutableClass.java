/**
 * 
 */
package com.study.java.immutable;

/**
 * @author rajan
 * 
 * Sample immutable class
 *
 */
public class ImmutableClass {
	
	final int i;

	/**
	 * 
	 */
	public ImmutableClass(int i) {
		this.i=i;
	}
	

	public int getI() {
		return i;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableClass imc=new ImmutableClass(42);
		System.out.println(imc.getI());
	}

}
