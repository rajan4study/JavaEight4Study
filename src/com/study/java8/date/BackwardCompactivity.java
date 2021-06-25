package com.study.java8.date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @author rajan
 * 
 * Date format in previous java version can be easy convert to new API to use new features 25Jun2021
 *
 */
public class BackwardCompactivity {
	public static void main(String...args) {
		Date currentDateOld=new Date();
		System.out.println(currentDateOld);
		Instant instant=currentDateOld.toInstant();
		ZoneId zoneId=ZoneId.systemDefault();
		LocalDateTime currentDateNew=LocalDateTime.ofInstant(instant, zoneId);
		System.out.println(currentDateNew);
		ZonedDateTime currentDateNewZone=ZonedDateTime.ofInstant(instant, zoneId);
		System.out.println(currentDateNewZone);
	}

}
