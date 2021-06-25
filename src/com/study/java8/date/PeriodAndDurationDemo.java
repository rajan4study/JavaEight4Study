package com.study.java8.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author rajan
 * 
 * demo for class Period and Duration -21Jun2021
 *
 */
public class PeriodAndDurationDemo {

	public static void main(String[] args) {
		LocalDate date1=LocalDate.now();
		LocalDate date2=date1.plus(4, ChronoUnit.DAYS);
		System.out.println(Period.between(date2, date1));
		
		
		LocalTime time1=LocalTime.now();
		Duration dur=Duration.ofHours(2);
		LocalTime time2=time1.plus(dur);
		System.out.println(Duration.between(time2, time1));
	}
}
