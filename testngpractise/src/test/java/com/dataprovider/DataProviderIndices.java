package com.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderIndices {
	
	@Test(dataProvider="dp1")
	public void multipleobje(Object[] s) {
		for(int i=0; i<s.length;i++)
			System.out.println(s[i]);
	}
	
	
	@DataProvider(indices = {0,1})//using indices we are sending the partial data only tha is only 1 and 1 index data sending  to test method
	public Object[][] dp1() {
		Object[][] data=new Object[][] {
				{"auna", 123},
				{"auna1", 123,679},
				{"auna2", "123r","1278"},
		};	
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
