package com.testngpractise;

import org.testng.annotations.Test;

public class Groupttestdependecy {

	
	@Test(groups= "sanity")
	public void test13() {
		System.out.println("sanity");
	}
	

	@Test(groups= "sanity")
	public void test14() {
		System.out.println("sanity");
	}
	

	@Test(groups= "sanity")
	public void test15() {
		System.out.println("sanity");
	}
	

	@Test(groups= "sanity")
	public void test16() {
		System.out.println(555%0);
	}
	
	@Test(dependsOnGroups = {"sanity"})
	public void test0() {
		System.out.println("main test");
	}
	
	
}
