package com.dataprovider;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClassEx {

	@Test(dataProvider="dptt", dataProviderClass = DataSupplier.class) //using data provider class name and dataprovider name we can execute test method and we can create many data provider classes in one project and many data provide in one data provider class
	public void Iterateobje(String[] s) {
		
			System.out.println(s[0]+">>>>"+s[1]);
	}
	
	
	/*@DataProvider(name="dptt") we have created data supplier class separately and used here in test method with class name
	public Iterator<String[]> dp1() {
		Set<String[]> data=new HashSet<>();
				data.add(new String[]{"arunareddy","djhi"});
				data.add(new String[]{"gbjkhdb","jhoiew"});
		return data.iterator();
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
}
