package com.study.java.clone;

/**
 * @author rajan
 *
 */
public class CloningConcepts {
	
	public static void main(String args[]) throws CloneNotSupportedException {
		
		//Shallow copying demo
		CloneObject obj1=new CloneObject();
		obj1.i=10;
		obj1.j=20;
		CloneObject obj2=obj1;
		obj2.i=3;
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		//Deep copy demo
		CloneObject obj3=new CloneObject();
		obj3.i=10;
		obj3.j=20;
		CloneObject obj4=new CloneObject();
		obj4.i=obj3.i;
		obj4.j=obj3.j;
		obj4.i=1;
		System.out.println(obj3.toString());
		System.out.println(obj4.toString());
		//clone method
		CloneObject obj5=(CloneObject) obj4.clone();
		System.out.println(obj5.toString());
		obj5.i=30;
		System.out.println(obj5.toString());
	}

}

class CloneObject implements Cloneable{
	int i;
	int j;
	
	@Override
	public String toString() {
		return "Copy [i=" + i + ", j=" + j + "]";
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
