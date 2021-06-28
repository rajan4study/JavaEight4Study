package com.study.java.pattern.star;

import java.util.Scanner;

/**
 * @author rajan
 * 
 * Pascal triangle using string pattern
 * @since 28Jun2021
 *
 */
public class PascalTriangleDemo {
	
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		int i,j;
		int size;
		System.out.println("Enter size: ");
		Scanner scanner=new Scanner(System.in);
		size=Integer.parseInt(scanner.nextLine());
		for(i=0;i<size;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(i=1;i<size;i++) {
			for(j=size;j>i;j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
