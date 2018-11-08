/**
 * 
 */
package com.fu.springmvc.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 @author： fu    @time：2018年11月8日 上午12:03:36 
 @说明： 一份耕耘，一份收获
**/
public class StringToDateConverter implements Converter<String, Date> {
	
	private String datePattern;
	public StringToDateConverter(String datePattern) {
		this.datePattern=datePattern;
		System.out.println("instantiating ....converter with pattern:*");
	}
	
	@Override
	public Date convert(String s) {
		SimpleDateFormat sdf=new SimpleDateFormat(datePattern);
		//setLenient用于设置Calendar是否宽松解析字符串，如果为false，则严格解析；默认为true，宽松解析
		sdf.setLenient(false);
		
		try {
			return sdf.parse(s);
		} catch (ParseException e) {
			
			e.printStackTrace();
			throw new IllegalArgumentException("invalid date format.please use this pattern\""+datePattern+"\"");		
			}
		
		
	}

}
