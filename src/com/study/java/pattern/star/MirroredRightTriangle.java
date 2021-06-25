package com.study.java.pattern.star;

/**
 * @author rajan
 * 
 * Mirried right tringle pattern using * 24Jun2021
 *
 */
public class MirroredRightTriangle {

	public static void main(String[] args) {
		int row=5;
		int i,j;
		for(i=0;i<row;i++) {
			for(j=0;j<row-i-1;j++) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*"+"");
			}
			System.out.println();
			
		}
	}
}
