package com.grouptest;


import org.testng.annotations.Test;
import org.testng.annotations.Ignore;



public class NewTest {
	
	
  @Test(groups= {"smoke", "sanity", "regession"})
  public void Test1() {
	  System.out.println("Test1");
  }
  
  
  @Test(groups= {"smoke"})
  public void Test2() {
	  System.out.println("Test2");
  }
  
  
 
  @Test(groups= {"functional", "sanity"})
  public void Test3() {
	  System.out.println("Test3");
  }
  
  
  @Test
  public void Test4() {
	  System.out.println("Test4");
  }
  
  
  
  
  
  
  
  
  
  
  
}
