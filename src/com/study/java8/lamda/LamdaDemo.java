/**
 * 
 */
package com.study.java8.lamda;

/**
 * @author rajan
 *
 */
public class LamdaDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dem dem= ()->System.out.println("test1");
		dem.play();
		dem.pause();
		dem.stop();

	}
	@FunctionalInterface
	interface Dem{
		void play();
		default void  pause() {
			System.out.println("test2");
		}
		default void stop() {
			System.out.println("test3");
		}
	}

}
