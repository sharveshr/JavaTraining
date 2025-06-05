package com.Training.dayThree;

import java.util.Calendar;

public class CalendarMethods {

	public static void main(String[] args) {
		Calendar calendarObj = Calendar.getInstance();
		System.out.println("Day of the month "+calendarObj.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of the week "+calendarObj.get(Calendar.DAY_OF_WEEK));
		System.out.println("Date "+calendarObj.get(Calendar.DATE));
		System.out.println("Day of the year "+calendarObj.get(Calendar.DAY_OF_YEAR));
		System.out.println("Week of the year "+calendarObj.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Day of the week in month "+calendarObj.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("Week of the month "+calendarObj.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Hour "+calendarObj.get(Calendar.HOUR));
		System.out.println("Minute "+calendarObj.get(Calendar.MINUTE));
		System.out.println("Second "+calendarObj.get(Calendar.SECOND));
		System.out.println("AM_PM "+calendarObj.get(Calendar.AM_PM));

	}

}
