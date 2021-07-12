/**
 * 
 */
package com.study.java.pattern.star;

/**
 * @author
 *
 */
public class DiamondHollowPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i, j, k, size = 5;
		for (i = 1; i <= size; i++) {
			for (j = 1; j < size; j++) {
				if((i==1 && j==size-1)) {
					System.out.print(" *");
				}
				if(
						((i!=1 && j==size-i+1))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
					
				}
			}
			for (j = size; j <= 2*size; j++) {
				if(((i!=1 && j==size+i-1))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (i = 2; i <= size; i++) {
			for (j = 1; j <=i; j++) {
				if(i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			for (j = 1; j <2*size; j++) {
				if(j==2*(size-i)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
