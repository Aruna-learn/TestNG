package com.demo;


import org.testng.annotations.Test;
import org.testng.annotations.Ignore;




@Ignore//ignore the test methods at class level
public class NewTest {
  @Test
  public void Test1() {
	  System.out.println("Test1");
  }
  
  @Ignore//ignore the test methods at method level
  @Test
  public void Test2() {
	  System.out.println("Test2");
  }
  
  
  @Ignore
  @Test
  public void Test3() {
	  System.out.println("Test3");
  }
  
  
  @Test
  public void Test4() {
	  System.out.println("Test4");
  }
  
  
  
  
  
  
  
  
  
  
  
}
