/**
 * 
 */
package com.study.java.pattern.star;

/**
 * @author rajan
 * 
 * Print 'A' using star
 *
 */
public class AUsingStar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i, j, height=8;
		for(i=0;i<=height;i++) {
			for(j=0;j<=(height/2)+1;j++) {
				if((i==0 && j<(height/2) && j!=0) 
						||
						(i!=0 && (j==0 || j==(height/2)))
						||
						(i==height/2) &&(j<height/2)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}

	}

}
