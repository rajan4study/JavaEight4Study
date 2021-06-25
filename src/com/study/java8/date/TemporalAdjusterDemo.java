package com.study.java8.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * @author rajan
 * 
 * Temporal aduster feature enable us to do some action like first saturday of next month 25Jun2021
 *
 */
public class TemporalAdjusterDemo {
	public static void main(String args[]) {
		LocalDate todayDate=LocalDate.now();
		System.out.println(todayDate);
		LocalDate nextSaturday=todayDate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println(nextSaturday);
	}

}
