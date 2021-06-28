package com.study.java.pattern.star;

/**
 * @author rajan
 * 
 * reverse pyramid using star patten 25Jun2021
 *
 */
public class ReversePyramid {

	public static void main(String args[]) {
		int i,j;
		int row=8;
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=0;j<=row-i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
