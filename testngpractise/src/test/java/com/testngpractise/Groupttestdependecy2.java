package com.testngpractise;

import org.testng.annotations.Test;

public class Groupttestdependecy2 {

	
	@Test(groups= "sanity")
	public void sn() {
		System.out.println("sanity1");
	}
	

	@Test(groups= "sanity")
	public void sn1() {
		System.out.println("sanity2");
	}
	

	@Test(groups= "sanity")
	public void sn2() {
		System.out.println(775%0);
	}
	

	@Test(groups= "smoke")
	public void sm() {
		System.out.println("smoke1");
	}
	@Test(groups= "smoke")
	public void sm1() {
		System.out.println("smoke2");
	}
	
	@Test(groups= "smoke")
	public void sm2() {
		System.out.println("smoke3");
	}
	
	@Test(groups= "regression")
	public void reg() {
		System.out.println("regression1");
	}
	
	@Test(groups= "regression")
	public void reg1() {
		System.out.println("regression2");
	}
	
	
	@Test(dependsOnGroups = {"sanity","smoke"})
	public void test01() {
		System.out.println("main test1");
	}
	
	
}

//when the dependent test is failed tests will skip but we dont't want to skip so we use the alwaysRun=true it will execute
