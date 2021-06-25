package com.study.java8.date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author rajan
 * 
 * Demo Chrono enum feature which replaces the integer use of day, month ect..24-Jun-2021
 *
 */
public class ChronoDemo {

	public static void main(String...args) {
		LocalDateTime date= LocalDateTime.now();
		System.out.println(date);
		System.out.println(date.plus(1, ChronoUnit.DAYS));
		System.out.println(date.plus(1, ChronoUnit.MONTHS));
		System.out.println(date.plus(1, ChronoUnit.YEARS));
		System.out.println(date.plus(1, ChronoUnit.DECADES));
	}
}
