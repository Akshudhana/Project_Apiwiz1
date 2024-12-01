package com.genericUtility;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

public class javaUtils 
{
	/**
	 * this method used to generate random number
	 * @return
	 */
	public int getRandomNumber()
	{
		
		Random ran = new Random();
		int random =ran.nextInt(1000);
		return random;
		
	}
	/**
	 * this method is used to capture system date and time
	 * @return
	 */
	public String getSystemDate()
	{
		Date dt = new Date();
		String date = dt.toString();
		return date;
		
	}
	/**
	 * this method is used to convert system date time formate to other date time formate
	 * @return
	 */
	public String getSystemDateInFormat()
	{
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		Date dt = new Date();
		String date = dateformat.format(dt);
		return date;

	}

}
