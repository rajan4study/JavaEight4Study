package com.study.java8.random;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author rajan
 * 
 * Demo for random number generator- 21 june 2021
 *
 */
public class RandomNumberGenDemo {

	public static void main(String args[]) {
		
		/*****************Math.random()********************************/
		//generate random numbers between 0 to 1
		//double value
		System.out.println(Math.random());
		//generate random numbers between 200 to 400
		//formula Math.random()*(max-min+1)+min
		System.out.println(Math.random()*(400-200)+200);
		
		/*****************Random class********************************/
		
		Random random=new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextLong());
		System.out.println(random.nextInt(400));
		System.out.println(random.nextBoolean());
		System.out.println(random.nextDouble());
		System.out.println(random.nextFloat());
		// for random byte
		byte[] byteArr=new byte[2];
		random.nextBytes(byteArr);
		for(byte b:byteArr) {
			System.out.println(b);
		}
		
		/*****************ThreadLocalRandom********************************/
		
		System.out.println(ThreadLocalRandom.current().nextInt());
		System.out.println(ThreadLocalRandom.current().nextInt(100));
		System.out.println(ThreadLocalRandom.current().nextInt(3,6));
		System.out.println(ThreadLocalRandom.current().nextBoolean());
		System.out.println(ThreadLocalRandom.current().nextDouble());
		System.out.println(ThreadLocalRandom.current().nextDouble(6));
		System.out.println(ThreadLocalRandom.current().nextDouble(3,6));
		System.out.println(ThreadLocalRandom.current().nextFloat());
		System.out.println(ThreadLocalRandom.current().nextLong());
		System.out.println(ThreadLocalRandom.current().nextLong(1000));
		System.out.println(ThreadLocalRandom.current().nextLong(0, 9));
		byte[] bytes=new byte[2];
		ThreadLocalRandom.current().nextBytes(bytes);
		for(byte b:bytes) {
			System.out.println(b);
		}
		/*****************Random in java8********************************/
		System.out.println("test");
		//random.ints().forEach(System.out::println); random numbers
		random.ints(4).forEach(System.out::println);
		random.ints(3,6,10).forEach(System.out::println);// illegal argument will throw if origin greater or equal to bond
		//random.ints(0, 5).forEach(System.out::println); infinite numbers
		//random.doubles().forEach(System.out::println);
		random.doubles(3).forEach(System.out::println);
		random.doubles(3,6,9).forEach(System.out::println);
		//random.doubles(0,1).forEach(System.out::println);
		//random.longs().forEach(System.out::println)
		random.longs(3).forEach(System.out::println);
		random.longs(3,6,9).forEach(System.out::println);
		//random.longs(6,9).forEach(System.out::println);
		
	}
}
