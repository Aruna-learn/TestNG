package com.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Objectjaggedarrayreturntype {



	
	@Test(dataProvider="dptt")
	public void multipleobj(String[] s) {
		for(int i=0; i<s.length;i++)
			System.out.println(s[i]);
	}
	
	
	@DataProvider(name="dptt")
	public String[][] dp1() {
		String[][] data=new String[][] {
				{"auna", "123"},
				{"auna1", "123t","679"},
				{"auna2", "123r","1278"},
		};	
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
