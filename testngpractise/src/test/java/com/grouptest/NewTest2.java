package com.grouptest;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


@Test(groups= {"all"})// partial group all the test inside the class are part of the group
public class NewTest2 {
	  @Test
	  public void Test5() {
		  System.out.println("Test5");
	  }
	  
	  
	  @Test(groups= {"sanity"})
	  public void Test6() {
		  System.out.println("Test6");
	  }
	  
	  
	  @Test(groups= {"functional"})
	  public void Test7() {
		  System.out.println("Test7");
	  }
	  
	  
	  @Test(groups= {"smoke"})
	  public void Test8() {
		  System.out.println("Test8");
	  }
}