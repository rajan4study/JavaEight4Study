package com.study.java.pattern.star;

public class RightTrianglePattern {
	
	/**
	 * @param args
	 * pattern creation- right triangle with star -21jun-2021
	 */
	public static void main(String args[]) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
