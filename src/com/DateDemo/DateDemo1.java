package com.DateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {
	
		
		//Date d1=new Date();
		
		//System.out.println(d1);
		
		String pattern="yyyy-mm-dd hh:mm:ss";
		SimpleDateFormat SimpleDateFormat=new SimpleDateFormat(pattern);
		String date=SimpleDateFormat.format(new Date());
		System.out.println(date);

	}

}