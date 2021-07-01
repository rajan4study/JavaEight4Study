/**
 * 
 */
package com.study.java.string;

/**
 * @author rajan
 *
 */
public class StringVsBuffer {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
		String str="abc";
		long start=System.currentTimeMillis();
		System.out.println(str.hashCode());
		for(i=0;i<10000;i++) {
			str+="ad";
		}
		long end =System.currentTimeMillis();
		System.out.println(str.hashCode());
		System.out.println(end-start);
		start=System.currentTimeMillis();
		StringBuffer strB=new  StringBuffer("abc");
		System.out.println(strB.hashCode());
		for(i=0;i<10000;i++) {
			strB.append("ad");
		}
		System.out.println(strB.hashCode());
		System.out.println(System.currentTimeMillis()-start);

	}

}
