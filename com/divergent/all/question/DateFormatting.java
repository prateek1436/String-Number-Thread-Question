package com.divergent.all.question;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatting {
	public static void main(String args[]) throws ParseException {
		SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
		String str = ft.format(new Date());
		System.out.println("Formatted Date : " + str);
		str = "02/18/1995";
		ft = new SimpleDateFormat("MM/dd/yyyy");
		Date date = ft.parse(str);
		System.out.println("Parsed Date : " + date);
	}
}
