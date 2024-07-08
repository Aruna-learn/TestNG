package com.testngpractise;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestMethodDependency2 {
      String tracknum=null;
	
      @Ignore
	@Test(priority=1)
	public void CreateShipment() {
		System.out.println(5/0);
		System.out.println("CreateShipment");
		tracknum="av23op";
	}
	
	
	@Test(priority=2,dependsOnMethods = {"CreateShipment"},alwaysRun = true)
	public void TrackShipment() throws Exception {
		if(tracknum !=null)
		System.out.println("TrackShipment");
		else
			throw new Exception("tracknum not generated or invalid");
			
	}
	
	
	@Test(priority=3,dependsOnMethods = {"CreateShipment"},ignoreMissingDependencies = true)  
	public void CancelShipment() throws Exception {
		if(tracknum !=null)
		System.out.println("CancelShipment");
		else
			throw new Exception("tracknum not generated or invalid");
	}
	
}
	
	
//if we set priority to test methods and it will not consider because dependecy concept is the highest priority(ex trachship prority 1 and createshp priority 2 , priority concept will not work here)	
//when the dependent test is failed tests will skip but we dont't want to skip so we use the alwaysRun=true it will execute
//when he dependent test ignoredskippesdeleted  if still we want  to run means use the ignoremissingdependecies=true
	
	
	
	
	

