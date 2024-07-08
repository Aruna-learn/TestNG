package com.dataprovider;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Iteratorobjectarray {

	
	@Test(dataProvider="dptt")
	public void Iterateobje(String[] s) {
		
			System.out.println(s[0]+">>>>"+s[1]);
	}
	
	
	@DataProvider(name="dptt")
	public Iterator<String[]> dp1() {
		Set<String[]> data=new HashSet<>();
				data.add(new String[]{"aruna","djhi"});
				data.add(new String[]{"gbjkh","jhoiew"});
		return data.iterator();
	}
	
	
	
	
}
