package com.demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class NewTest2 {
	  @Test
	  public void Test5() {
		  System.out.println("Test5");
	  }
	  
	  @Test
	  public void Test6() {
		  System.out.println("Test6");
	  }
	  @Ignore
	  @Test
	  public void Test7() {
		  System.out.println("Test7");
	  }
	  
	  
	  @Test
	  public void Test8() {
		  System.out.println("Test8");
	  }
}