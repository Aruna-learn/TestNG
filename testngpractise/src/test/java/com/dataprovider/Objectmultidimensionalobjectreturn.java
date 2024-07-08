package com.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Objectmultidimensionalobjectreturn {

	@Test(dataProvider="dptt")
	public void multipleobje(Object[] s) {
		for(int i=0; i<s.length;i++)
			System.out.println(s[i]);
	}
	
	
	@DataProvider(name="dptt")
	public Object[][] dp1() {
		Object[][] data=new Object[][] {
				{"auna", 123},
				{"auna1", 123,679},
				{"auna2", "123r","1278"},
		};	
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
