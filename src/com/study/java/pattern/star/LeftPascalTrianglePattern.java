package com.study.java.pattern.star;

/**
 * @author rajan
 * Left pascal triangle using star pattern
 * @since 29JUn2021
 *
 */
public class LeftPascalTrianglePattern {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		int i, j, size=5;
		for(i=0;i<size;i++) {
			for(j=0;j<size-i-1;j++) {
				System.out.print("  ");
			}
			for(j=0;j<i+1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		for(i=1;i<=size-1;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" "+" ");
			}
			for(j=0;j<size-i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
