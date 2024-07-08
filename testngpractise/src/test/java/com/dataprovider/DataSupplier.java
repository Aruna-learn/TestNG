package com.dataprovider;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.DataProvider;

public class DataSupplier {

	@DataProvider(name="dptt")
	public Iterator<String[]> dp1() {
		Set<String[]> data=new HashSet<>();
				data.add(new String[]{"aruna","djhi"});
				data.add(new String[]{"gbjkh","jhoiew"});
		return data.iterator();
	}
	
	@DataProvider(name="dptt")    //we can create many data provider in one class and and many data  provider class in one project anyway we use the data provider name and data provider class name to execute the test method
	public Object[] dpc() {
		Object[] data=new Object[] {
				1,
				"auna",
				"ani",
				66
		};
		return data;
	}
	
	
	
	
	
	
	
	
	
}
