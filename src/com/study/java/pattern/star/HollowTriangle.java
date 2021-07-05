/**
 * 
 */
package com.study.java.pattern.star;

/**
 * @author 
 *
 */
public class HollowTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i, j,k,size=5;
		for(i=1;i<=size;i++) {
			for(j=i;j<=size;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++) {
				if(k==1||i==size||k==2*i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
