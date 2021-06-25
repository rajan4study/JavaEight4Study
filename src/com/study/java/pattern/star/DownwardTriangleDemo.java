package com.study.java.pattern.star;

/**
 * @author rajan
 * 
 * program to display downward triangle using star patten -23Jun2021
 *
 */
public class DownwardTriangleDemo {
	public static void main(String...args) {
		int row=5;
		int i,j;
		for(i=row;i>0;i--) {
			for(j=0;j<=i-1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
