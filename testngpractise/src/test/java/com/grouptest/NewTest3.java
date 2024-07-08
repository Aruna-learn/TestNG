package com.grouptest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class NewTest3 {
	  @Test
	  public void Test9() {
		  System.out.println("Test9");
	  }
	  
	  
	  @Test(groups= {"sanity","windows.sanity"})
	  public void Test10() {
		  System.out.println("Test10");
	  }
	  
	  
	  @Test(groups= {"functional","windows.functional","ios.smoke"})
	  public void Test11() {
		  System.out.println("Test11");
	  }
	  
	  
	  @Test(groups= {"smoke","windows.smoke"})
	  public void Test12() {
		  System.out.println("Test12");
	  }
}