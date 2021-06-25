package com.study.java8.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author rajan
 * 
 * zoned date demo -24Jun-2021
 *
 */
public class ZonedDateDemo {

	public static void main(String[] args) {
		ZonedDateTime zoneDate=ZonedDateTime.parse("2021-06-24T10:15:30+05:30[Europe/Berlin]");
		System.out.println(zoneDate);
		ZoneId id=ZoneId.of("Europe/Paris");
		System.out.println(id);
		System.out.println(zoneDate.getZone());
		System.out.println(ZoneId.systemDefault());
	}
}
