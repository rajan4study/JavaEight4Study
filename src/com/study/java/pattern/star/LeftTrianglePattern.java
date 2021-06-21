package com.study.java.pattern.star;

/**
 * @author rajan
 * 
 * Left triangle - star pattern -21Jun2021
 *
 */
public class LeftTrianglePattern {
	
	public static void main(String args[]) {
		int i,j;
		for(i=0;i<5;i++) {
			for(j=2*(5-i);j>=0;j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
