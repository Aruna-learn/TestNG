package com.dataprovider;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Iteratorobjectarray1 {
	
	//Iterator<Object[]> array
	@Test(dataProvider="dptt")
	public void Iterateobje(Object[] s) {
		
			System.out.println(s[0]+">>>>"+s[1]);
	}
	
	
	@DataProvider(name="dptt")
	public Iterator<Object[]> dp1() {
		Set<Object[]> data=new HashSet<>();
				data.add(new Object[]{"aruna",124});
				data.add(new Object[]{"gbjkh",900});
		return data.iterator();
	}
}
