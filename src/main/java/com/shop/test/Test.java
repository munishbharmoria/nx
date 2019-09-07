package com.shop.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		SimpleDateFormat queryFormatter;
		queryFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Calendar calendarStart = Calendar.getInstance();
		calendarStart.add(Calendar.DATE, -7);
		String date = queryFormatter.format(calendarStart.getTime());
		System.out.println(date);
	}

}
