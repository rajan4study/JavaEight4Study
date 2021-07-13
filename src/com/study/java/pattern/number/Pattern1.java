/**
 * 
 */
package com.study.java.pattern.number;

/**
 * @author
 *
 */
public class Pattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,j,size=8;
		for(i=1;i<=size;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
