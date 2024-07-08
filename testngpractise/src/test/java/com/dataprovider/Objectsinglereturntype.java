package com.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Objectsinglereturntype {

	@Test(dataProvider="dptt")
	public void sinleobj(Object o) {
		System.out.println(o);
	}
	
	
	@DataProvider(name="dptt")
	public Object[] dp1() {//if we don't know data is integer or string or float then return type Object we use like this
		Object[] data=new Object[] {
				1,
				"auna",
				"ani",
				66
		};
		return data;
	}
	
	
	
	
	
	
	//@Test(dataProvider="dptt")
	//public void sinleobj(Integer i) {
		//	System.out.println(i);
	//}

	//@DataProvider(name="dptt")
		//public Integer[] dp1() {//if we know data is integer then return type integer we use like this
		//	Integer[] data=new Integer[] {
		//			1,
		//			3,
		//			8
		//};
		//return data;
		//}
	
	
	
	
	
	
	
	//@Test(dataProvider="dptt")
	//public void sinleobj(String s) {
		//	System.out.println(s);
	//}
	
	//@DataProvider(name="dptt")
		//public String[] dp1() {  //if we know data is string then return type string we use like this
		//	String[] data=new String[] {
		//			"aruna",
		//			"chini"
		//	};
		//	return data;
		//}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
