package org.test.dwr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DwrDemo {

	public String sayHello(String name) {
		System.out.println("Hello, " + name);
		return "Hello, " + name;
	}

	public String sayHi(String name) {
		System.out.println("Hi, " + name);
		return "Hi, " + name;
	}

	public String sayChineseHi(String name) {
		System.out.println("嗨, " + name);
		return "嗨, " + name;
	}

	public String getTime(String time) {
		Date date = new Date();
		if (time != null) {
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
			try {
				date = format.parse(time);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
//		return date.getTime();
		return date.toString();
	}
}
