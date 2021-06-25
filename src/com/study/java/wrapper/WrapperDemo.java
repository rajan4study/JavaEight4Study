package com.study.java.wrapper;

/**
 * @author rajan
 *
 */
public class WrapperDemo {
	
	public static void main(String args) {
		int i=5;// int is primitive
		@SuppressWarnings("deprecation")
		Integer j=new Integer(i);// boxing/wrapping
		Integer k=i;//auto-boxing
		
		int z=j.intValue();//unboxing/unwrapping
		int w=j;//auto-unboxing
		
		String str="123";
		Integer strInt=Integer.parseInt(str);
		
	}

}
