package com.samples.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.test.TestSuiteApp;

public class StringUtilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringUtilTest test= new StringUtilTest();
			
				test.StringSub();
		       
		}
			
		    private void StringSub() {
		    	
		    	String orgstr="(bar)";
		    	
		    	orgstr=orgstr.replaceAll("\\(bar\\)", "rba");
		    	
		    	System.out.println("the new string="+ orgstr);
		    
		    }
}
