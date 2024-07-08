package com.testngpractise;

import org.testng.annotations.Test;

public class TestMethodDependency {
      String tracknum=null;
	
	@Test(priority=1)
	public void CreateShipment() {
		System.out.println(5/0);
		System.out.println("CreateShipment");
		tracknum="av23op";
	}
	
	
	@Test(priority=2,dependsOnMethods = {"CreateShipment"})
	public void TrackShipment() throws Exception {
		if(tracknum !=null)
		System.out.println("TrackShipment");
		else
			throw new Exception("tracknum not generated or invalid");
			
	}
	
	
	@Test(priority=3,dependsOnMethods = {"CreateShipment"})  //@Test(priority=3,dependsOnMethods = {"CreateShipment","TrackShipment"}) for multiple dependecies we can write like this
	public void CancelShipment() throws Exception {
		if(tracknum !=null)
		System.out.println("CancelShipment");
		else
			throw new Exception("tracknum not generated or invalid");
	}
	
	
	
	
	
	
	
	
	
	
	
}
