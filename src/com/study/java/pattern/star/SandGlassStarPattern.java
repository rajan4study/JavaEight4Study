/**
 * 
 */
package com.study.java.pattern.star;

/**
 * @author rajan
 *
 */
public class SandGlassStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,j,size=5;
		for(i=0;i<=size-1;i++) {
			for(j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(j=0;j<size-i;j++) {
				System.out.print("*"+" ");
			}
			if(i<size-1) {
				System.out.println();
			}
			
		}
		for(i=0;i<=size;i++) {
			for(j=0;j<size-i;j++) {
				System.out.print(" ");
			}
			for(j=0;j<i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		

	}

}
