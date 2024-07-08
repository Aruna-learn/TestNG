package com.dataprovider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Iteratorobject {

	@Test(dataProvider="dptt")
	public void Iterateobje(String s) {
		
			System.out.println(s);
	}
	
	
	@DataProvider(name="dptt")
	public Iterator<String> dp1() {
		List<String> data=new ArrayList<>();
				data.add("aruna");
		data.add("cjosdh");
		return data.iterator();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
