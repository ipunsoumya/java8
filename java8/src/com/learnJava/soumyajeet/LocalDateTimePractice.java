package com.learnJava.soumyajeet;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Comparator;

public class LocalDateTimePractice {
	public boolean bbol;
	public static void main(String[] args) {
		/*
		 * LocalDate localDate = LocalDate.now(); System.out.println(localDate);
		 * System.out.println(LocalDateTime.now());
		 * 
		 * //modifying localdate System.out.println(localDate.plusDays(2));
		 * 
		 * LocalDate localDate2 = LocalDate.of(2020, 2, 20);
		 * System.out.println(localDate2);
		 * System.out.println(localDate2.isBefore(localDate));
		 * System.out.println(localDate.isSupported(ChronoUnit.YEARS));
		 */
		
		LocalTime now1 = LocalTime.now();
		System.out.println(now1);
		System.out.println(now1.get(ChronoField.CLOCK_HOUR_OF_AMPM));
		
		
		LocalDateTimePractice localDateTimePractice = new LocalDateTimePractice();
		System.out.println(localDateTimePractice.bbol);
	}
}
