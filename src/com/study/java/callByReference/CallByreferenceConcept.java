package com.study.java.callByReference;

/**
 * @author rajan
 * 
 * call by reference demo 25Jun2021
 *
 */
public class CallByreferenceConcept {
	int j=60;
	public static void main(String arg[]) {
		int num=20;
		System.out.println(num);
		changePrimitive(num);// call by value
		System.out.println(num);
		
		
		CallByreferenceConcept obj= new CallByreferenceConcept();
		System.out.println(obj.j);
		changeObj(obj);//call by value only, but passing reference as value
		System.out.println(obj.j);
		
	}
	
	/**
	 * @param num
	 */
	static void changePrimitive(int num) {
		num=num+1;
	}
	/**
	 * @param obj
	 */
	static void changeObj(CallByreferenceConcept obj) {
		obj.j=obj.j+1;
	}


}
