/**
 * 
 */
package com.fu.springmvc.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

/**
 @author： fu    @time：2018年11月8日 上午10:55:20 
 @说明： 一份耕耘，一份收获
**/
public class DateFormatter implements Formatter<Date> {

	private String datePattern;
	private SimpleDateFormat dateFormat;
	
	/**
	 * 
	 */
	public DateFormatter(String datePattern) {
		this.datePattern=datePattern;
		dateFormat=new SimpleDateFormat(datePattern);
		dateFormat.setLenient(false);
	}
	

	
	
	@Override
	public String print(Date date, Locale locale) {
		return dateFormat.format(date);
	}

	/* (non-Javadoc)
	 * @see org.springframework.format.Parser#parse(java.lang.String, java.util.Locale)
	 */
	@Override
	public Date parse(String s, Locale locale)  {

			try {
				return dateFormat.parse(s);
			} catch (ParseException e) {
				e.printStackTrace();
				throw new IllegalArgumentException("invalid date format. Please use this pattern\""+datePattern+"\"");
			}
		
			
		
	}

}
