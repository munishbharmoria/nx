package com.shop.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.util.SystemPropertyUtils;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Calendar calendarStart = Calendar.getInstance();
		Calendar calendarEnd = Calendar.getInstance();
		calendarStart.add(Calendar.DATE, -7);
		String startDate = calendarStart.getTime().toString();
		String endDate = calendarEnd.getTime().toString();
		System.out.println(startDate);
		System.out.println(endDate);
		
	}
}
