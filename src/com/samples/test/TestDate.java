package com.samples.test;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        TestDate.dateConverter();
	}
	
	private static void dateConverter() {
		
		String idpDate = "2021-02-04T23:40:30.191Z";
		String pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
		String patternForUI="MM/dd/yyyy hh:mm:ss a";
			  
			  
	    SimpleDateFormat simpleFormatter = new SimpleDateFormat(pattern);
	    // a ParsePosition object with value zero
	    ParsePosition startPos = new ParsePosition(0);
	    // Parse the IDP DATE
	    Date parsedDate = simpleFormatter.parse(idpDate, startPos);
			    
	    //Create new date
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patternForUI);
	    String date = simpleDateFormat.format(parsedDate);
	    System.out.println("idp date: "+ idpDate);
	    System.out.println("UI date: "+ date);
			    
	}

}
