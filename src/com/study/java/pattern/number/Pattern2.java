package com.study.java.pattern.number;

/**
 * @author 
 *
 */
public class Pattern2 {

	public static void main(String[] args) {
		int i, j,k=1;
		for(i=0;i<7;i++) {
			for(j=0;j<i;j++) {
				System.out.print(k+++" ");
			}
			System.out.println();
		}
	}
}
