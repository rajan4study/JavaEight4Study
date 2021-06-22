package com.study.java.pattern.star;
import java.util.Scanner;

/**
 * @author rajan
 *
 */
public class DiamondPattern {
	public static void main(String args[]) {
		int row, i, j, space = 1;
		System.out.print("Enter the number of rows you want to print: ");
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		space=row-1;
		for(i=1;i<=row;i++) {
			for(j=1;j<=space;j++) {
				System.out.print(" ");
			}
			space--;
			for(j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		space=1;
		for(i=1;i<=row;i++) {
			for(j=1;j<=space;j++) {
				System.out.print(" ");
			}
			space++;
			for(j=1;j<=2*(row-i)-1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}