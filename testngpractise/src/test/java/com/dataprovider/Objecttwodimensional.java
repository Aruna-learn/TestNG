package com.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Objecttwodimensional {
	
	@Test(dataProvider="dptt")
	public void multipleobj(String username, String password) {
		System.out.println(username+">>>>" +password);
	}
	
	
	@DataProvider(name="dptt")
	public String[][] dp1() {
		String[][] data=new String[][] {
				{"auna", "123"},
				{"auna1", "123t"},
				{"auna2", "123r"},
		};	
		return data;
	}
	
}
