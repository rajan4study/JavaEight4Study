package com.study.java.pattern.star;

/**
 * @author rajan
 * 
 * Right triangle mirror 26Jun2021
 *
 */
public class RightReverseMirrorTriangle {
	
	public static void main(String args[]) {
		int i,j,size=5;
		for(i=0;i<size;i++) {
			for(j=0;j<i;j++) {
				System.out.print("  ");
			}
			for(j=0;j<size-i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
