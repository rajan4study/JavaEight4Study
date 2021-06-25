package com.study.java8.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * @author rajan
 * 
 * Demo for LocalDate-Time api 23Jun2021
 *
 */
public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime currentTime=LocalDateTime.now();//current date time
		System.out.println(currentTime);
		LocalDate currentDate=currentTime.toLocalDate();//current date
		System.out.println(currentDate);
		System.out.println(LocalDate.now());//current date - alter ways
		Month month=currentTime.getMonth();//getMonth- enum
		System.out.println(month);
		int day=currentTime.getDayOfMonth();
		System.out.println(day);// day
		int seconds=currentTime.getSecond();
		System.out.println(seconds);// seconds
		LocalDateTime time1=currentTime.withDayOfMonth(10).withYear(2012);//alter the date
		System.out.println(time1);
		LocalDate date3=LocalDate.of(2021, Month.AUGUST, 3);//of method for create date
		System.out.println(date3);
		LocalTime time2=LocalTime.of(10, 10, 10);//of method for time cration
		System.out.println(time2);
		LocalTime time3=LocalTime.parse("11:15:10");//parse method
		System.out.println(time3);
	}
}
